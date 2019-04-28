package com.macro.mall.mapper;

import com.macro.mall.model.TbPromotion;
import com.macro.mall.model.TbPromotionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPromotionMapper {
    int countByExample(TbPromotionExample example);

    int deleteByExample(TbPromotionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbPromotion record);

    int insertSelective(TbPromotion record);

    List<TbPromotion> selectByExample(TbPromotionExample example);

    TbPromotion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbPromotion record, @Param("example") TbPromotionExample example);

    int updateByExample(@Param("record") TbPromotion record, @Param("example") TbPromotionExample example);

    int updateByPrimaryKeySelective(TbPromotion record);

    int updateByPrimaryKey(TbPromotion record);
}