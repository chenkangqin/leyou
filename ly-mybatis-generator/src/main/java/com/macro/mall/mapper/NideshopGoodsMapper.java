package com.macro.mall.mapper;

import com.macro.mall.model.NideshopGoods;
import com.macro.mall.model.NideshopGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopGoodsMapper {
    int countByExample(NideshopGoodsExample example);

    int deleteByExample(NideshopGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopGoods record);

    int insertSelective(NideshopGoods record);

    List<NideshopGoods> selectByExampleWithBLOBs(NideshopGoodsExample example);

    List<NideshopGoods> selectByExample(NideshopGoodsExample example);

    NideshopGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopGoods record, @Param("example") NideshopGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") NideshopGoods record, @Param("example") NideshopGoodsExample example);

    int updateByExample(@Param("record") NideshopGoods record, @Param("example") NideshopGoodsExample example);

    int updateByPrimaryKeySelective(NideshopGoods record);

    int updateByPrimaryKeyWithBLOBs(NideshopGoods record);

    int updateByPrimaryKey(NideshopGoods record);
}