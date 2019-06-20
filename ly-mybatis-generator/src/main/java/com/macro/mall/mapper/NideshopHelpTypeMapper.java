package com.macro.mall.mapper;

import com.macro.mall.model.NideshopHelpType;
import com.macro.mall.model.NideshopHelpTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopHelpTypeMapper {
    int countByExample(NideshopHelpTypeExample example);

    int deleteByExample(NideshopHelpTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopHelpType record);

    int insertSelective(NideshopHelpType record);

    List<NideshopHelpType> selectByExample(NideshopHelpTypeExample example);

    NideshopHelpType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopHelpType record, @Param("example") NideshopHelpTypeExample example);

    int updateByExample(@Param("record") NideshopHelpType record, @Param("example") NideshopHelpTypeExample example);

    int updateByPrimaryKeySelective(NideshopHelpType record);

    int updateByPrimaryKey(NideshopHelpType record);
}