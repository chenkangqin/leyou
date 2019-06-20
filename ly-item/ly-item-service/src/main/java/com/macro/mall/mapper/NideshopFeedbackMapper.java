package com.macro.mall.mapper;

import com.macro.mall.model.NideshopFeedback;
import com.macro.mall.model.NideshopFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopFeedbackMapper {
    int countByExample(NideshopFeedbackExample example);

    int deleteByExample(NideshopFeedbackExample example);

    int deleteByPrimaryKey(Integer msgId);

    int insert(NideshopFeedback record);

    int insertSelective(NideshopFeedback record);

    List<NideshopFeedback> selectByExampleWithBLOBs(NideshopFeedbackExample example);

    List<NideshopFeedback> selectByExample(NideshopFeedbackExample example);

    NideshopFeedback selectByPrimaryKey(Integer msgId);

    int updateByExampleSelective(@Param("record") NideshopFeedback record, @Param("example") NideshopFeedbackExample example);

    int updateByExampleWithBLOBs(@Param("record") NideshopFeedback record, @Param("example") NideshopFeedbackExample example);

    int updateByExample(@Param("record") NideshopFeedback record, @Param("example") NideshopFeedbackExample example);

    int updateByPrimaryKeySelective(NideshopFeedback record);

    int updateByPrimaryKeyWithBLOBs(NideshopFeedback record);

    int updateByPrimaryKey(NideshopFeedback record);
}