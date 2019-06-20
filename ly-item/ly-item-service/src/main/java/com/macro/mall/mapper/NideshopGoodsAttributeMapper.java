package com.macro.mall.mapper;

import com.macro.mall.model.NideshopGoodsAttribute;
import com.macro.mall.model.NideshopGoodsAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopGoodsAttributeMapper {
    int countByExample(NideshopGoodsAttributeExample example);

    int deleteByExample(NideshopGoodsAttributeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopGoodsAttribute record);

    int insertSelective(NideshopGoodsAttribute record);

    List<NideshopGoodsAttribute> selectByExampleWithBLOBs(NideshopGoodsAttributeExample example);

    List<NideshopGoodsAttribute> selectByExample(NideshopGoodsAttributeExample example);

    NideshopGoodsAttribute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopGoodsAttribute record, @Param("example") NideshopGoodsAttributeExample example);

    int updateByExampleWithBLOBs(@Param("record") NideshopGoodsAttribute record, @Param("example") NideshopGoodsAttributeExample example);

    int updateByExample(@Param("record") NideshopGoodsAttribute record, @Param("example") NideshopGoodsAttributeExample example);

    int updateByPrimaryKeySelective(NideshopGoodsAttribute record);

    int updateByPrimaryKeyWithBLOBs(NideshopGoodsAttribute record);

    int updateByPrimaryKey(NideshopGoodsAttribute record);
}