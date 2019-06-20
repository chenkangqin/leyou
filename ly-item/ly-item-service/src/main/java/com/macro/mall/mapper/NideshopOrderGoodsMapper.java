package com.macro.mall.mapper;

import com.macro.mall.model.NideshopOrderGoods;
import com.macro.mall.model.NideshopOrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopOrderGoodsMapper {
    int countByExample(NideshopOrderGoodsExample example);

    int deleteByExample(NideshopOrderGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopOrderGoods record);

    int insertSelective(NideshopOrderGoods record);

    List<NideshopOrderGoods> selectByExampleWithBLOBs(NideshopOrderGoodsExample example);

    List<NideshopOrderGoods> selectByExample(NideshopOrderGoodsExample example);

    NideshopOrderGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopOrderGoods record, @Param("example") NideshopOrderGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") NideshopOrderGoods record, @Param("example") NideshopOrderGoodsExample example);

    int updateByExample(@Param("record") NideshopOrderGoods record, @Param("example") NideshopOrderGoodsExample example);

    int updateByPrimaryKeySelective(NideshopOrderGoods record);

    int updateByPrimaryKeyWithBLOBs(NideshopOrderGoods record);

    int updateByPrimaryKey(NideshopOrderGoods record);
}