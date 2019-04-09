package com.luoye.mapper;

import com.luoye.model.Testuser;
import com.luoye.model.TestuserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestuserMapper {
    int countByExample(TestuserExample example);

    int deleteByExample(TestuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Testuser record);

    int insertSelective(Testuser record);

    List<Testuser> selectByExample(TestuserExample example);

    Testuser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Testuser record, @Param("example") TestuserExample example);

    int updateByExample(@Param("record") Testuser record, @Param("example") TestuserExample example);

    int updateByPrimaryKeySelective(Testuser record);

    int updateByPrimaryKey(Testuser record);
}