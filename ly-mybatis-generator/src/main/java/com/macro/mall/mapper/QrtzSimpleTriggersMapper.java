package com.macro.mall.mapper;

import com.macro.mall.model.QrtzSimpleTriggers;
import com.macro.mall.model.QrtzSimpleTriggersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzSimpleTriggersMapper {
    int countByExample(QrtzSimpleTriggersExample example);

    int deleteByExample(QrtzSimpleTriggersExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int insert(QrtzSimpleTriggers record);

    int insertSelective(QrtzSimpleTriggers record);

    List<QrtzSimpleTriggers> selectByExample(QrtzSimpleTriggersExample example);

    QrtzSimpleTriggers selectByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int updateByExampleSelective(@Param("record") QrtzSimpleTriggers record, @Param("example") QrtzSimpleTriggersExample example);

    int updateByExample(@Param("record") QrtzSimpleTriggers record, @Param("example") QrtzSimpleTriggersExample example);

    int updateByPrimaryKeySelective(QrtzSimpleTriggers record);

    int updateByPrimaryKey(QrtzSimpleTriggers record);
}