package com.macro.mall.mapper;

import com.macro.mall.model.TbUserCoupon;
import com.macro.mall.model.TbUserCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserCouponMapper {
    int countByExample(TbUserCouponExample example);

    int deleteByExample(TbUserCouponExample example);

    int deleteByPrimaryKey(Long couponCode);

    int insert(TbUserCoupon record);

    int insertSelective(TbUserCoupon record);

    List<TbUserCoupon> selectByExample(TbUserCouponExample example);

    TbUserCoupon selectByPrimaryKey(Long couponCode);

    int updateByExampleSelective(@Param("record") TbUserCoupon record, @Param("example") TbUserCouponExample example);

    int updateByExample(@Param("record") TbUserCoupon record, @Param("example") TbUserCouponExample example);

    int updateByPrimaryKeySelective(TbUserCoupon record);

    int updateByPrimaryKey(TbUserCoupon record);
}