package com.dao;

import com.entity.YongyaojiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YongyaojiluView;

/**
 * 用药记录 Dao 接口
 *
 * @author 
 */
public interface YongyaojiluDao extends BaseMapper<YongyaojiluEntity> {

   List<YongyaojiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
