package com.luoye.service;

import com.luoye.pojo.PageDataTemplate;

public interface UserManagerService {
    PageDataTemplate findBrandListAllForVerify(int pageIndex,int pageSize);
}
