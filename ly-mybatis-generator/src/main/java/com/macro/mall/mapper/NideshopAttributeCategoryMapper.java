package com.macro.mall.mapper;

import com.macro.mall.model.NideshopAttributeCategory;
import com.macro.mall.model.NideshopAttributeCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopAttributeCategoryMapper {
    int countByExample(NideshopAttributeCategoryExample example);

    int deleteByExample(NideshopAttributeCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopAttributeCategory record);

    int insertSelective(NideshopAttributeCategory record);

    List<NideshopAttributeCategory> selectByExample(NideshopAttributeCategoryExample example);

    NideshopAttributeCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopAttributeCategory record, @Param("example") NideshopAttributeCategoryExample example);

    int updateByExample(@Param("record") NideshopAttributeCategory record, @Param("example") NideshopAttributeCategoryExample example);

    int updateByPrimaryKeySelective(NideshopAttributeCategory record);

    int updateByPrimaryKey(NideshopAttributeCategory record);
}