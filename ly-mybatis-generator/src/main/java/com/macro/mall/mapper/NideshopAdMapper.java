package com.macro.mall.mapper;

import com.macro.mall.model.NideshopAd;
import com.macro.mall.model.NideshopAdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopAdMapper {
    int countByExample(NideshopAdExample example);

    int deleteByExample(NideshopAdExample example);

    int deleteByPrimaryKey(Short id);

    int insert(NideshopAd record);

    int insertSelective(NideshopAd record);

    List<NideshopAd> selectByExampleWithBLOBs(NideshopAdExample example);

    List<NideshopAd> selectByExample(NideshopAdExample example);

    NideshopAd selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") NideshopAd record, @Param("example") NideshopAdExample example);

    int updateByExampleWithBLOBs(@Param("record") NideshopAd record, @Param("example") NideshopAdExample example);

    int updateByExample(@Param("record") NideshopAd record, @Param("example") NideshopAdExample example);

    int updateByPrimaryKeySelective(NideshopAd record);

    int updateByPrimaryKeyWithBLOBs(NideshopAd record);

    int updateByPrimaryKey(NideshopAd record);
}