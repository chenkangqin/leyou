package com.macro.mall.mapper;

import com.macro.mall.model.NideshopGoodsGallery;
import com.macro.mall.model.NideshopGoodsGalleryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopGoodsGalleryMapper {
    int countByExample(NideshopGoodsGalleryExample example);

    int deleteByExample(NideshopGoodsGalleryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopGoodsGallery record);

    int insertSelective(NideshopGoodsGallery record);

    List<NideshopGoodsGallery> selectByExampleWithBLOBs(NideshopGoodsGalleryExample example);

    List<NideshopGoodsGallery> selectByExample(NideshopGoodsGalleryExample example);

    NideshopGoodsGallery selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopGoodsGallery record, @Param("example") NideshopGoodsGalleryExample example);

    int updateByExampleWithBLOBs(@Param("record") NideshopGoodsGallery record, @Param("example") NideshopGoodsGalleryExample example);

    int updateByExample(@Param("record") NideshopGoodsGallery record, @Param("example") NideshopGoodsGalleryExample example);

    int updateByPrimaryKeySelective(NideshopGoodsGallery record);

    int updateByPrimaryKeyWithBLOBs(NideshopGoodsGallery record);

    int updateByPrimaryKey(NideshopGoodsGallery record);
}