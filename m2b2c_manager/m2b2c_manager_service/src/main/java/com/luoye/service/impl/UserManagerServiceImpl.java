package com.luoye.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luoye.mapper.UserMapper;
import com.luoye.model.User;
import com.luoye.model.UserExample;
import com.luoye.pojo.PageDataTemplate;
import com.luoye.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SuppressWarnings("unchecked")
public class UserManagerServiceImpl implements UserManagerService{
    @Autowired
    UserMapper userMapper;
    @Override
    public PageDataTemplate findBrandListAllForVerify(int pageIndex, int pageSize) {

        PageHelper.startPage(pageIndex,pageSize);
        UserExample userExample =new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAuthorityEqualTo(1);
        List<User> users = userMapper.selectByExample(userExample);
        PageInfo<User> pageInfo =new PageInfo<>(users);
        PageDataTemplate<User> pageDataTemplate =new PageDataTemplate();
        pageDataTemplate.setRows(users);
        pageDataTemplate.setTotal(pageInfo.getTotal());
        return pageDataTemplate;
    }
}
