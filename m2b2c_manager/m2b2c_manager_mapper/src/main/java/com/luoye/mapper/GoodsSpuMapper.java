package com.luoye.mapper;

import com.luoye.model.GoodsSpu;
import com.luoye.model.GoodsSpuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsSpuMapper {
    int countByExample(GoodsSpuExample example);

    int deleteByExample(GoodsSpuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSpu record);

    int insertSelective(GoodsSpu record);

    List<GoodsSpu> selectByExampleWithBLOBs(GoodsSpuExample example);

    List<GoodsSpu> selectByExample(GoodsSpuExample example);

    GoodsSpu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSpu record, @Param("example") GoodsSpuExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsSpu record, @Param("example") GoodsSpuExample example);

    int updateByExample(@Param("record") GoodsSpu record, @Param("example") GoodsSpuExample example);

    int updateByPrimaryKeySelective(GoodsSpu record);

    int updateByPrimaryKeyWithBLOBs(GoodsSpu record);

    int updateByPrimaryKey(GoodsSpu record);
}