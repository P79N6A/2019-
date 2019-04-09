package com.luoye.mapper;

import com.luoye.model.GoodsCategory;
import com.luoye.model.GoodsCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsCategoryMapper {
    int countByExample(GoodsCategoryExample example);

    int deleteByExample(GoodsCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsCategory record);

    int insertSelective(GoodsCategory record);

    List<GoodsCategory> selectByExample(GoodsCategoryExample example);

    GoodsCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsCategory record, @Param("example") GoodsCategoryExample example);

    int updateByExample(@Param("record") GoodsCategory record, @Param("example") GoodsCategoryExample example);

    int updateByPrimaryKeySelective(GoodsCategory record);

    int updateByPrimaryKey(GoodsCategory record);
}