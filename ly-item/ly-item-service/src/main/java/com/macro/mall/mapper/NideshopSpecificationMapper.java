package com.macro.mall.mapper;

import com.macro.mall.model.NideshopSpecification;
import com.macro.mall.model.NideshopSpecificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopSpecificationMapper {
    int countByExample(NideshopSpecificationExample example);

    int deleteByExample(NideshopSpecificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopSpecification record);

    int insertSelective(NideshopSpecification record);

    List<NideshopSpecification> selectByExample(NideshopSpecificationExample example);

    NideshopSpecification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopSpecification record, @Param("example") NideshopSpecificationExample example);

    int updateByExample(@Param("record") NideshopSpecification record, @Param("example") NideshopSpecificationExample example);

    int updateByPrimaryKeySelective(NideshopSpecification record);

    int updateByPrimaryKey(NideshopSpecification record);
}