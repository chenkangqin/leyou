package com.macro.mall.mapper;

import com.macro.mall.model.TbCategoryBrand;
import com.macro.mall.model.TbCategoryBrandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbCategoryBrandMapper {
    int countByExample(TbCategoryBrandExample example);

    int deleteByExample(TbCategoryBrandExample example);

    int deleteByPrimaryKey(@Param("categoryId") Long categoryId, @Param("brandId") Long brandId);

    int insert(TbCategoryBrand record);

    int insertSelective(TbCategoryBrand record);

    List<TbCategoryBrand> selectByExample(TbCategoryBrandExample example);

    int updateByExampleSelective(@Param("record") TbCategoryBrand record, @Param("example") TbCategoryBrandExample example);

    int updateByExample(@Param("record") TbCategoryBrand record, @Param("example") TbCategoryBrandExample example);
}