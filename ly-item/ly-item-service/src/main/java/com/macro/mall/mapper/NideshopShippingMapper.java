package com.macro.mall.mapper;

import com.macro.mall.model.NideshopShipping;
import com.macro.mall.model.NideshopShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopShippingMapper {
    int countByExample(NideshopShippingExample example);

    int deleteByExample(NideshopShippingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopShipping record);

    int insertSelective(NideshopShipping record);

    List<NideshopShipping> selectByExample(NideshopShippingExample example);

    NideshopShipping selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopShipping record, @Param("example") NideshopShippingExample example);

    int updateByExample(@Param("record") NideshopShipping record, @Param("example") NideshopShippingExample example);

    int updateByPrimaryKeySelective(NideshopShipping record);

    int updateByPrimaryKey(NideshopShipping record);
}