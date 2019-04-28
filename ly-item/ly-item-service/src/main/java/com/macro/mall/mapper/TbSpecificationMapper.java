package com.macro.mall.mapper;

import com.macro.mall.model.TbSpecification;
import com.macro.mall.model.TbSpecificationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSpecificationMapper {
    int countByExample(TbSpecificationExample example);

    int deleteByExample(TbSpecificationExample example);

    int deleteByPrimaryKey(Long categoryId);

    int insert(TbSpecification record);

    int insertSelective(TbSpecification record);

    List<TbSpecification> selectByExample(TbSpecificationExample example);

    TbSpecification selectByPrimaryKey(Long categoryId);

    int updateByExampleSelective(@Param("record") TbSpecification record, @Param("example") TbSpecificationExample example);

    int updateByExample(@Param("record") TbSpecification record, @Param("example") TbSpecificationExample example);

    int updateByPrimaryKeySelective(TbSpecification record);

    int updateByPrimaryKey(TbSpecification record);
}