package com.leyou.user.mapper;

import com.leyou.user.pojo.NideshopUser;
import com.leyou.user.pojo.NideshopUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NideshopUserMapper {
    int countByExample(NideshopUserExample example);

    int deleteByExample(NideshopUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopUser record);

    int insertSelective(NideshopUser record);

    List<NideshopUser> selectByExample(NideshopUserExample example);

    NideshopUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopUser record, @Param("example") NideshopUserExample example);

    int updateByExample(@Param("record") NideshopUser record, @Param("example") NideshopUserExample example);

    int updateByPrimaryKeySelective(NideshopUser record);

    int updateByPrimaryKey(NideshopUser record);
}