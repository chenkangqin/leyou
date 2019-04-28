package com.macro.mall.mapper;

import com.macro.mall.model.TbOrderStatus;
import com.macro.mall.model.TbOrderStatusExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderStatusMapper {
    int countByExample(TbOrderStatusExample example);

    int deleteByExample(TbOrderStatusExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(TbOrderStatus record);

    int insertSelective(TbOrderStatus record);

    List<TbOrderStatus> selectByExample(TbOrderStatusExample example);

    TbOrderStatus selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") TbOrderStatus record, @Param("example") TbOrderStatusExample example);

    int updateByExample(@Param("record") TbOrderStatus record, @Param("example") TbOrderStatusExample example);

    int updateByPrimaryKeySelective(TbOrderStatus record);

    int updateByPrimaryKey(TbOrderStatus record);
}