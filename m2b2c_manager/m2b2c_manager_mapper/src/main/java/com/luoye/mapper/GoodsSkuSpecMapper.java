package com.luoye.mapper;

import com.luoye.model.GoodsSkuSpec;
import com.luoye.model.GoodsSkuSpecExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsSkuSpecMapper {
    int countByExample(GoodsSkuSpecExample example);

    int deleteByExample(GoodsSkuSpecExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSkuSpec record);

    int insertSelective(GoodsSkuSpec record);

    List<GoodsSkuSpec> selectByExample(GoodsSkuSpecExample example);

    GoodsSkuSpec selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSkuSpec record, @Param("example") GoodsSkuSpecExample example);

    int updateByExample(@Param("record") GoodsSkuSpec record, @Param("example") GoodsSkuSpecExample example);

    int updateByPrimaryKeySelective(GoodsSkuSpec record);

    int updateByPrimaryKey(GoodsSkuSpec record);
}