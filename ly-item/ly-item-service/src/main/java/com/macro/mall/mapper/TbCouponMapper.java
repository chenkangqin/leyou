package com.macro.mall.mapper;

import com.macro.mall.model.TbCoupon;
import com.macro.mall.model.TbCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCouponMapper {
    int countByExample(TbCouponExample example);

    int deleteByExample(TbCouponExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCoupon record);

    int insertSelective(TbCoupon record);

    List<TbCoupon> selectByExample(TbCouponExample example);

    TbCoupon selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCoupon record, @Param("example") TbCouponExample example);

    int updateByExample(@Param("record") TbCoupon record, @Param("example") TbCouponExample example);

    int updateByPrimaryKeySelective(TbCoupon record);

    int updateByPrimaryKey(TbCoupon record);
}