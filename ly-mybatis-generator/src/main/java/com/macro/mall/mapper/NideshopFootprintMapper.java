package com.macro.mall.mapper;

import com.macro.mall.model.NideshopFootprint;
import com.macro.mall.model.NideshopFootprintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopFootprintMapper {
    int countByExample(NideshopFootprintExample example);

    int deleteByExample(NideshopFootprintExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopFootprint record);

    int insertSelective(NideshopFootprint record);

    List<NideshopFootprint> selectByExample(NideshopFootprintExample example);

    NideshopFootprint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopFootprint record, @Param("example") NideshopFootprintExample example);

    int updateByExample(@Param("record") NideshopFootprint record, @Param("example") NideshopFootprintExample example);

    int updateByPrimaryKeySelective(NideshopFootprint record);

    int updateByPrimaryKey(NideshopFootprint record);
}