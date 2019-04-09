package com.luoye.mapper;

import com.luoye.model.GoodsType;
import com.luoye.model.GoodsTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsTypeMapper {
    int countByExample(GoodsTypeExample example);

    int deleteByExample(GoodsTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    List<GoodsType> selectByExampleWithBLOBs(GoodsTypeExample example);

    List<GoodsType> selectByExample(GoodsTypeExample example);

    GoodsType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);

    int updateByExample(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKeyWithBLOBs(GoodsType record);

    int updateByPrimaryKey(GoodsType record);
}