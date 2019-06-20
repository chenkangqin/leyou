package com.macro.mall.mapper;

import com.macro.mall.model.NideshopSearchHistory;
import com.macro.mall.model.NideshopSearchHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopSearchHistoryMapper {
    int countByExample(NideshopSearchHistoryExample example);

    int deleteByExample(NideshopSearchHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopSearchHistory record);

    int insertSelective(NideshopSearchHistory record);

    List<NideshopSearchHistory> selectByExample(NideshopSearchHistoryExample example);

    NideshopSearchHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopSearchHistory record, @Param("example") NideshopSearchHistoryExample example);

    int updateByExample(@Param("record") NideshopSearchHistory record, @Param("example") NideshopSearchHistoryExample example);

    int updateByPrimaryKeySelective(NideshopSearchHistory record);

    int updateByPrimaryKey(NideshopSearchHistory record);
}