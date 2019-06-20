package com.macro.mall.mapper;

import com.macro.mall.model.NideshopTopic;
import com.macro.mall.model.NideshopTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopTopicMapper {
    int countByExample(NideshopTopicExample example);

    int deleteByExample(NideshopTopicExample example);

    int insert(NideshopTopic record);

    int insertSelective(NideshopTopic record);

    List<NideshopTopic> selectByExampleWithBLOBs(NideshopTopicExample example);

    List<NideshopTopic> selectByExample(NideshopTopicExample example);

    int updateByExampleSelective(@Param("record") NideshopTopic record, @Param("example") NideshopTopicExample example);

    int updateByExampleWithBLOBs(@Param("record") NideshopTopic record, @Param("example") NideshopTopicExample example);

    int updateByExample(@Param("record") NideshopTopic record, @Param("example") NideshopTopicExample example);
}