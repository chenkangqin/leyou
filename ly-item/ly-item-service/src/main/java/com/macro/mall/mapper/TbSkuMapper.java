package com.macro.mall.mapper;

import com.macro.mall.model.TbSku;
import com.macro.mall.model.TbSkuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSkuMapper {
    int countByExample(TbSkuExample example);

    int deleteByExample(TbSkuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSku record);

    int insertSelective(TbSku record);

    List<TbSku> selectByExample(TbSkuExample example);

    TbSku selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSku record, @Param("example") TbSkuExample example);

    int updateByExample(@Param("record") TbSku record, @Param("example") TbSkuExample example);

    int updateByPrimaryKeySelective(TbSku record);

    int updateByPrimaryKey(TbSku record);
}