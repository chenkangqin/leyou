package com.macro.mall.mapper;

import com.macro.mall.model.Cid3;
import com.macro.mall.model.Cid3Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Cid3Mapper {
    int countByExample(Cid3Example example);

    int deleteByExample(Cid3Example example);

    int insert(Cid3 record);

    int insertSelective(Cid3 record);

    List<Cid3> selectByExample(Cid3Example example);

    int updateByExampleSelective(@Param("record") Cid3 record, @Param("example") Cid3Example example);

    int updateByExample(@Param("record") Cid3 record, @Param("example") Cid3Example example);
}