package com.macro.mall.mapper;

import com.macro.mall.model.NideshopCouponGoods;
import com.macro.mall.model.NideshopCouponGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopCouponGoodsMapper {
    int countByExample(NideshopCouponGoodsExample example);

    int deleteByExample(NideshopCouponGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopCouponGoods record);

    int insertSelective(NideshopCouponGoods record);

    List<NideshopCouponGoods> selectByExample(NideshopCouponGoodsExample example);

    NideshopCouponGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopCouponGoods record, @Param("example") NideshopCouponGoodsExample example);

    int updateByExample(@Param("record") NideshopCouponGoods record, @Param("example") NideshopCouponGoodsExample example);

    int updateByPrimaryKeySelective(NideshopCouponGoods record);

    int updateByPrimaryKey(NideshopCouponGoods record);
}