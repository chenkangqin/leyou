package com.macro.mall.mapper;

import com.macro.mall.model.NideshopUserLevel;
import com.macro.mall.model.NideshopUserLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopUserLevelMapper {
    int countByExample(NideshopUserLevelExample example);

    int deleteByExample(NideshopUserLevelExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(NideshopUserLevel record);

    int insertSelective(NideshopUserLevel record);

    List<NideshopUserLevel> selectByExample(NideshopUserLevelExample example);

    NideshopUserLevel selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") NideshopUserLevel record, @Param("example") NideshopUserLevelExample example);

    int updateByExample(@Param("record") NideshopUserLevel record, @Param("example") NideshopUserLevelExample example);

    int updateByPrimaryKeySelective(NideshopUserLevel record);

    int updateByPrimaryKey(NideshopUserLevel record);
}