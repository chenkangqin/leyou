package com.macro.mall.mapper;

import com.macro.mall.model.NideshopCoupon;
import com.macro.mall.model.NideshopCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopCouponMapper {
    int countByExample(NideshopCouponExample example);

    int deleteByExample(NideshopCouponExample example);

    int deleteByPrimaryKey(Short id);

    int insert(NideshopCoupon record);

    int insertSelective(NideshopCoupon record);

    List<NideshopCoupon> selectByExample(NideshopCouponExample example);

    NideshopCoupon selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") NideshopCoupon record, @Param("example") NideshopCouponExample example);

    int updateByExample(@Param("record") NideshopCoupon record, @Param("example") NideshopCouponExample example);

    int updateByPrimaryKeySelective(NideshopCoupon record);

    int updateByPrimaryKey(NideshopCoupon record);
}