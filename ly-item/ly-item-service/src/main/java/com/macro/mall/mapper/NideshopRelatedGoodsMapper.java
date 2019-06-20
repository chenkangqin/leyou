package com.macro.mall.mapper;

import com.macro.mall.model.NideshopRelatedGoods;
import com.macro.mall.model.NideshopRelatedGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopRelatedGoodsMapper {
    int countByExample(NideshopRelatedGoodsExample example);

    int deleteByExample(NideshopRelatedGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopRelatedGoods record);

    int insertSelective(NideshopRelatedGoods record);

    List<NideshopRelatedGoods> selectByExample(NideshopRelatedGoodsExample example);

    NideshopRelatedGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopRelatedGoods record, @Param("example") NideshopRelatedGoodsExample example);

    int updateByExample(@Param("record") NideshopRelatedGoods record, @Param("example") NideshopRelatedGoodsExample example);

    int updateByPrimaryKeySelective(NideshopRelatedGoods record);

    int updateByPrimaryKey(NideshopRelatedGoods record);
}