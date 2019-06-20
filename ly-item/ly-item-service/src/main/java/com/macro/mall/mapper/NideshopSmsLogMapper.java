package com.macro.mall.mapper;

import com.macro.mall.model.NideshopSmsLog;
import com.macro.mall.model.NideshopSmsLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopSmsLogMapper {
    int countByExample(NideshopSmsLogExample example);

    int deleteByExample(NideshopSmsLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopSmsLog record);

    int insertSelective(NideshopSmsLog record);

    List<NideshopSmsLog> selectByExample(NideshopSmsLogExample example);

    NideshopSmsLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopSmsLog record, @Param("example") NideshopSmsLogExample example);

    int updateByExample(@Param("record") NideshopSmsLog record, @Param("example") NideshopSmsLogExample example);

    int updateByPrimaryKeySelective(NideshopSmsLog record);

    int updateByPrimaryKey(NideshopSmsLog record);
}