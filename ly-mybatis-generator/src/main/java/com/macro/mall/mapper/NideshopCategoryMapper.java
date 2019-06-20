package com.macro.mall.mapper;

import com.macro.mall.model.NideshopCategory;
import com.macro.mall.model.NideshopCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopCategoryMapper {
    int countByExample(NideshopCategoryExample example);

    int deleteByExample(NideshopCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopCategory record);

    int insertSelective(NideshopCategory record);

    List<NideshopCategory> selectByExample(NideshopCategoryExample example);

    NideshopCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopCategory record, @Param("example") NideshopCategoryExample example);

    int updateByExample(@Param("record") NideshopCategory record, @Param("example") NideshopCategoryExample example);

    int updateByPrimaryKeySelective(NideshopCategory record);

    int updateByPrimaryKey(NideshopCategory record);
}