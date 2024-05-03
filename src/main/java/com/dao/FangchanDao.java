package com.dao;

import com.entity.FangchanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FangchanView;

/**
 * 房产信息 Dao 接口
 *
 * @author 
 */
public interface FangchanDao extends BaseMapper<FangchanEntity> {

   List<FangchanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
