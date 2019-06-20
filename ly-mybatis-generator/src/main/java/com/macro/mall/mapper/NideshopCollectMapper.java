package com.macro.mall.mapper;

import com.macro.mall.model.NideshopCollect;
import com.macro.mall.model.NideshopCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopCollectMapper {
    int countByExample(NideshopCollectExample example);

    int deleteByExample(NideshopCollectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopCollect record);

    int insertSelective(NideshopCollect record);

    List<NideshopCollect> selectByExample(NideshopCollectExample example);

    NideshopCollect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopCollect record, @Param("example") NideshopCollectExample example);

    int updateByExample(@Param("record") NideshopCollect record, @Param("example") NideshopCollectExample example);

    int updateByPrimaryKeySelective(NideshopCollect record);

    int updateByPrimaryKey(NideshopCollect record);
}