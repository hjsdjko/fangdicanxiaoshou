
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 房产信息
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/fangchan")
public class FangchanController {
    private static final Logger logger = LoggerFactory.getLogger(FangchanController.class);

    @Autowired
    private FangchanService fangchanService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;
    @Autowired
    private YuangongService yuangongService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("客户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("销售经理".equals(role))
            params.put("yuangongId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = fangchanService.queryPage(params);

        //字典表数据转换
        List<FangchanView> list =(List<FangchanView>)page.getList();
        for(FangchanView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        FangchanEntity fangchan = fangchanService.selectById(id);
        if(fangchan !=null){
            //entity转view
            FangchanView view = new FangchanView();
            BeanUtils.copyProperties( fangchan , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody FangchanEntity fangchan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,fangchan:{}",this.getClass().getName(),fangchan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<FangchanEntity> queryWrapper = new EntityWrapper<FangchanEntity>()
            .eq("fangchan_uuid_number", fangchan.getFangchanUuidNumber())
            .eq("fangchan_name", fangchan.getFangchanName())
            .eq("fangchan_types", fangchan.getFangchanTypes())
            .eq("fangchan_address", fangchan.getFangchanAddress())
            .eq("fangchan_mianjis", fangchan.getFangchanMianjis())
            .eq("fangchan_quyu", fangchan.getFangchanQuyu())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        FangchanEntity fangchanEntity = fangchanService.selectOne(queryWrapper);
        if(fangchanEntity==null){
            fangchan.setInsertTime(new Date());
            fangchan.setCreateTime(new Date());
            fangchanService.insert(fangchan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody FangchanEntity fangchan, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,fangchan:{}",this.getClass().getName(),fangchan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<FangchanEntity> queryWrapper = new EntityWrapper<FangchanEntity>()
            .notIn("id",fangchan.getId())
            .andNew()
            .eq("fangchan_uuid_number", fangchan.getFangchanUuidNumber())
            .eq("fangchan_name", fangchan.getFangchanName())
            .eq("fangchan_types", fangchan.getFangchanTypes())
            .eq("fangchan_address", fangchan.getFangchanAddress())
            .eq("fangchan_mianjis", fangchan.getFangchanMianjis())
            .eq("fangchan_quyu", fangchan.getFangchanQuyu())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        FangchanEntity fangchanEntity = fangchanService.selectOne(queryWrapper);
        if("".equals(fangchan.getFangchanPhoto()) || "null".equals(fangchan.getFangchanPhoto())){
                fangchan.setFangchanPhoto(null);
        }
        if(fangchanEntity==null){
            fangchanService.updateById(fangchan);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        fangchanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<FangchanEntity> fangchanList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            FangchanEntity fangchanEntity = new FangchanEntity();
//                            fangchanEntity.setFangchanUuidNumber(data.get(0));                    //房产编号 要改的
//                            fangchanEntity.setFangchanName(data.get(0));                    //房产名 要改的
//                            fangchanEntity.setFangchanTypes(Integer.valueOf(data.get(0)));   //房产户型 要改的
//                            fangchanEntity.setFangchanPhoto("");//照片
//                            fangchanEntity.setFangchanAddress(data.get(0));                    //房产地址 要改的
//                            fangchanEntity.setFangchanMianjis(Integer.valueOf(data.get(0)));   //房屋面积 要改的
//                            fangchanEntity.setFangchanQuyu(data.get(0));                    //所在区域 要改的
//                            fangchanEntity.setFangchanContent("");//照片
//                            fangchanEntity.setInsertTime(date);//时间
//                            fangchanEntity.setCreateTime(date);//时间
                            fangchanList.add(fangchanEntity);


                            //把要查询是否重复的字段放入map中
                                //房产编号
                                if(seachFields.containsKey("fangchanUuidNumber")){
                                    List<String> fangchanUuidNumber = seachFields.get("fangchanUuidNumber");
                                    fangchanUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> fangchanUuidNumber = new ArrayList<>();
                                    fangchanUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("fangchanUuidNumber",fangchanUuidNumber);
                                }
                        }

                        //查询是否重复
                         //房产编号
                        List<FangchanEntity> fangchanEntities_fangchanUuidNumber = fangchanService.selectList(new EntityWrapper<FangchanEntity>().in("fangchan_uuid_number", seachFields.get("fangchanUuidNumber")));
                        if(fangchanEntities_fangchanUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(FangchanEntity s:fangchanEntities_fangchanUuidNumber){
                                repeatFields.add(s.getFangchanUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [房产编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        fangchanService.insertBatch(fangchanList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = fangchanService.queryPage(params);

        //字典表数据转换
        List<FangchanView> list =(List<FangchanView>)page.getList();
        for(FangchanView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        FangchanEntity fangchan = fangchanService.selectById(id);
            if(fangchan !=null){


                //entity转view
                FangchanView view = new FangchanView();
                BeanUtils.copyProperties( fangchan , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody FangchanEntity fangchan, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,fangchan:{}",this.getClass().getName(),fangchan.toString());
        Wrapper<FangchanEntity> queryWrapper = new EntityWrapper<FangchanEntity>()
            .eq("fangchan_uuid_number", fangchan.getFangchanUuidNumber())
            .eq("fangchan_name", fangchan.getFangchanName())
            .eq("fangchan_types", fangchan.getFangchanTypes())
            .eq("fangchan_address", fangchan.getFangchanAddress())
            .eq("fangchan_mianjis", fangchan.getFangchanMianjis())
            .eq("fangchan_quyu", fangchan.getFangchanQuyu())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        FangchanEntity fangchanEntity = fangchanService.selectOne(queryWrapper);
        if(fangchanEntity==null){
            fangchan.setInsertTime(new Date());
            fangchan.setCreateTime(new Date());
        fangchanService.insert(fangchan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
