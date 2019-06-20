package com.macro.mall.mapper;

import com.macro.mall.model.SysSmsLog;
import com.macro.mall.model.SysSmsLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSmsLogMapper {
    int countByExample(SysSmsLogExample example);

    int deleteByExample(SysSmsLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysSmsLog record);

    int insertSelective(SysSmsLog record);

    List<SysSmsLog> selectByExampleWithBLOBs(SysSmsLogExample example);

    List<SysSmsLog> selectByExample(SysSmsLogExample example);

    SysSmsLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysSmsLog record, @Param("example") SysSmsLogExample example);

    int updateByExampleWithBLOBs(@Param("record") SysSmsLog record, @Param("example") SysSmsLogExample example);

    int updateByExample(@Param("record") SysSmsLog record, @Param("example") SysSmsLogExample example);

    int updateByPrimaryKeySelective(SysSmsLog record);

    int updateByPrimaryKeyWithBLOBs(SysSmsLog record);

    int updateByPrimaryKey(SysSmsLog record);
}