package com.macro.mall.mapper;

import com.macro.mall.model.NideshopAdPosition;
import com.macro.mall.model.NideshopAdPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopAdPositionMapper {
    int countByExample(NideshopAdPositionExample example);

    int deleteByExample(NideshopAdPositionExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(NideshopAdPosition record);

    int insertSelective(NideshopAdPosition record);

    List<NideshopAdPosition> selectByExample(NideshopAdPositionExample example);

    NideshopAdPosition selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") NideshopAdPosition record, @Param("example") NideshopAdPositionExample example);

    int updateByExample(@Param("record") NideshopAdPosition record, @Param("example") NideshopAdPositionExample example);

    int updateByPrimaryKeySelective(NideshopAdPosition record);

    int updateByPrimaryKey(NideshopAdPosition record);
}