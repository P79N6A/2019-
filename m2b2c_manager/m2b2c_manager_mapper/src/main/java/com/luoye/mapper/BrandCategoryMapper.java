package com.luoye.mapper;

import com.luoye.model.BrandCategory;
import com.luoye.model.BrandCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandCategoryMapper {
    int countByExample(BrandCategoryExample example);

    int deleteByExample(BrandCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BrandCategory record);

    int insertSelective(BrandCategory record);

    List<BrandCategory> selectByExample(BrandCategoryExample example);

    BrandCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BrandCategory record, @Param("example") BrandCategoryExample example);

    int updateByExample(@Param("record") BrandCategory record, @Param("example") BrandCategoryExample example);

    int updateByPrimaryKeySelective(BrandCategory record);

    int updateByPrimaryKey(BrandCategory record);

}