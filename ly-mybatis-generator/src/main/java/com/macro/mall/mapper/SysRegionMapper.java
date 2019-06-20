package com.macro.mall.mapper;

import com.macro.mall.model.SysRegion;
import com.macro.mall.model.SysRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRegionMapper {
    int countByExample(SysRegionExample example);

    int deleteByExample(SysRegionExample example);

    int deleteByPrimaryKey(Short id);

    int insert(SysRegion record);

    int insertSelective(SysRegion record);

    List<SysRegion> selectByExample(SysRegionExample example);

    SysRegion selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") SysRegion record, @Param("example") SysRegionExample example);

    int updateByExample(@Param("record") SysRegion record, @Param("example") SysRegionExample example);

    int updateByPrimaryKeySelective(SysRegion record);

    int updateByPrimaryKey(SysRegion record);
}