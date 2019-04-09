package com.luoye.mapper;

import com.luoye.model.GoodsSpecParam;
import com.luoye.model.GoodsSpecParamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsSpecParamMapper {
    int countByExample(GoodsSpecParamExample example);

    int deleteByExample(GoodsSpecParamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSpecParam record);

    int insertSelective(GoodsSpecParam record);

    List<GoodsSpecParam> selectByExample(GoodsSpecParamExample example);

    GoodsSpecParam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSpecParam record, @Param("example") GoodsSpecParamExample example);

    int updateByExample(@Param("record") GoodsSpecParam record, @Param("example") GoodsSpecParamExample example);

    int updateByPrimaryKeySelective(GoodsSpecParam record);

    int updateByPrimaryKey(GoodsSpecParam record);
}