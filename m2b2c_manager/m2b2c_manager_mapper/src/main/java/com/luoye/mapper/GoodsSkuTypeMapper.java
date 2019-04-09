package com.luoye.mapper;

import com.luoye.model.GoodsSkuType;
import com.luoye.model.GoodsSkuTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsSkuTypeMapper {
    int countByExample(GoodsSkuTypeExample example);

    int deleteByExample(GoodsSkuTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSkuType record);

    int insertSelective(GoodsSkuType record);

    List<GoodsSkuType> selectByExample(GoodsSkuTypeExample example);

    GoodsSkuType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSkuType record, @Param("example") GoodsSkuTypeExample example);

    int updateByExample(@Param("record") GoodsSkuType record, @Param("example") GoodsSkuTypeExample example);

    int updateByPrimaryKeySelective(GoodsSkuType record);

    int updateByPrimaryKey(GoodsSkuType record);
}