package com.leyou.user.service;

import com.leyou.user.pojo.NideshopUser;

public interface NideshopUserService {
    NideshopUser getUserById(Integer id);

    NideshopUser getUserByOpenId(String openid);

    void insertSelect(NideshopUser userVo);
}
