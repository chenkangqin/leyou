package com.macro.mall.mapper;

import com.macro.mall.model.NideshopChannel;
import com.macro.mall.model.NideshopChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopChannelMapper {
    int countByExample(NideshopChannelExample example);

    int deleteByExample(NideshopChannelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopChannel record);

    int insertSelective(NideshopChannel record);

    List<NideshopChannel> selectByExample(NideshopChannelExample example);

    NideshopChannel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopChannel record, @Param("example") NideshopChannelExample example);

    int updateByExample(@Param("record") NideshopChannel record, @Param("example") NideshopChannelExample example);

    int updateByPrimaryKeySelective(NideshopChannel record);

    int updateByPrimaryKey(NideshopChannel record);
}