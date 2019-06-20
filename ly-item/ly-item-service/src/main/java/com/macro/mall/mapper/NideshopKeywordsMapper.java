package com.macro.mall.mapper;

import com.macro.mall.model.NideshopKeywords;
import com.macro.mall.model.NideshopKeywordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopKeywordsMapper {
    int countByExample(NideshopKeywordsExample example);

    int deleteByExample(NideshopKeywordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopKeywords record);

    int insertSelective(NideshopKeywords record);

    List<NideshopKeywords> selectByExample(NideshopKeywordsExample example);

    NideshopKeywords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopKeywords record, @Param("example") NideshopKeywordsExample example);

    int updateByExample(@Param("record") NideshopKeywords record, @Param("example") NideshopKeywordsExample example);

    int updateByPrimaryKeySelective(NideshopKeywords record);

    int updateByPrimaryKey(NideshopKeywords record);
}