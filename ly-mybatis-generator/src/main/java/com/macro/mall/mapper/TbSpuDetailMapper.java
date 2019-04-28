package com.macro.mall.mapper;

import com.macro.mall.model.TbSpuDetail;
import com.macro.mall.model.TbSpuDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSpuDetailMapper {
    int countByExample(TbSpuDetailExample example);

    int deleteByExample(TbSpuDetailExample example);

    int deleteByPrimaryKey(Long spuId);

    int insert(TbSpuDetail record);

    int insertSelective(TbSpuDetail record);

    List<TbSpuDetail> selectByExampleWithBLOBs(TbSpuDetailExample example);

    List<TbSpuDetail> selectByExample(TbSpuDetailExample example);

    TbSpuDetail selectByPrimaryKey(Long spuId);

    int updateByExampleSelective(@Param("record") TbSpuDetail record, @Param("example") TbSpuDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") TbSpuDetail record, @Param("example") TbSpuDetailExample example);

    int updateByExample(@Param("record") TbSpuDetail record, @Param("example") TbSpuDetailExample example);

    int updateByPrimaryKeySelective(TbSpuDetail record);

    int updateByPrimaryKeyWithBLOBs(TbSpuDetail record);

    int updateByPrimaryKey(TbSpuDetail record);
}