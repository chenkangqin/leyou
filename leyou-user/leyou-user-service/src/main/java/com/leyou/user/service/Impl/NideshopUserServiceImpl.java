package com.leyou.user.service.Impl;

import com.leyou.user.mapper.NideshopUserMapper;
import com.leyou.user.pojo.NideshopUser;
import com.leyou.user.pojo.NideshopUserExample;
import com.leyou.user.service.NideshopUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NideshopUserServiceImpl implements NideshopUserService {
    @Autowired
    private NideshopUserMapper nideshopUserMapper;

    @Override
    public NideshopUser getUserById(Integer id) {
        return nideshopUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public NideshopUser getUserByOpenId(String openid) {
        NideshopUserExample example = new NideshopUserExample();
        example.createCriteria().andWeixinOpenidEqualTo(openid);
        List<NideshopUser> list =  nideshopUserMapper.selectByExample(example);
        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public void insertSelect(NideshopUser userVo) {
        nideshopUserMapper.insertSelective(userVo);
    }
}
