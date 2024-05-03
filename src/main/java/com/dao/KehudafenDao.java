package com.dao;

import com.entity.KehudafenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KehudafenView;

/**
 * 客户打分 Dao 接口
 *
 * @author 
 */
public interface KehudafenDao extends BaseMapper<KehudafenEntity> {

   List<KehudafenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
