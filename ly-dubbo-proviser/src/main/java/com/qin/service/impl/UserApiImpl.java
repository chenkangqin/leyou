package com.qin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.leyou.api.UserApi;

@Service(version = "1.0.0")
public class UserApiImpl implements UserApi {
    @Override
    public String getUserName(String userCode) {
        return "chenkangqin";
    }
}
