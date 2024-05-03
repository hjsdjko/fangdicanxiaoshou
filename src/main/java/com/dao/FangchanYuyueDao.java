package com.dao;

import com.entity.FangchanYuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FangchanYuyueView;

/**
 * 预约看房 Dao 接口
 *
 * @author 
 */
public interface FangchanYuyueDao extends BaseMapper<FangchanYuyueEntity> {

   List<FangchanYuyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
