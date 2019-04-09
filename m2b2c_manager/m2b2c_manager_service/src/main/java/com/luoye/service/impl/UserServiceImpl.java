package com.luoye.service.impl;

import com.luoye.mapper.TestuserMapper;
import com.luoye.model.Testuser;
import com.luoye.model.TestuserExample;
import com.luoye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    TestuserMapper testuserMapper;
    @Override
    public Testuser getUserById(int id) {
        TestuserExample testuserExample =new TestuserExample();
        TestuserExample.Criteria criteria = testuserExample.createCriteria();
        criteria.andIdEqualTo(id);

        List<Testuser> testusers = testuserMapper.selectByExample(testuserExample);
        if(testusers!=null){
            return testusers.get(0);
        }else{
            return null;
        }
    }
}
