package com.dao;

import com.entity.FangchanCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FangchanCollectionView;

/**
 * 房产收藏 Dao 接口
 *
 * @author 
 */
public interface FangchanCollectionDao extends BaseMapper<FangchanCollectionEntity> {

   List<FangchanCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
