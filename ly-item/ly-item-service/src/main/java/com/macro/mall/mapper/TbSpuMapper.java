package com.macro.mall.mapper;

import com.macro.mall.model.TbSpu;
import com.macro.mall.model.TbSpuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSpuMapper {
    int countByExample(TbSpuExample example);

    int deleteByExample(TbSpuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSpu record);

    int insertSelective(TbSpu record);

    List<TbSpu> selectByExample(TbSpuExample example);

    TbSpu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSpu record, @Param("example") TbSpuExample example);

    int updateByExample(@Param("record") TbSpu record, @Param("example") TbSpuExample example);

    int updateByPrimaryKeySelective(TbSpu record);

    int updateByPrimaryKey(TbSpu record);
}