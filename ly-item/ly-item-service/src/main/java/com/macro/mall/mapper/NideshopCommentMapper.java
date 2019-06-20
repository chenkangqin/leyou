package com.macro.mall.mapper;

import com.macro.mall.model.NideshopComment;
import com.macro.mall.model.NideshopCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopCommentMapper {
    int countByExample(NideshopCommentExample example);

    int deleteByExample(NideshopCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopComment record);

    int insertSelective(NideshopComment record);

    List<NideshopComment> selectByExample(NideshopCommentExample example);

    NideshopComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopComment record, @Param("example") NideshopCommentExample example);

    int updateByExample(@Param("record") NideshopComment record, @Param("example") NideshopCommentExample example);

    int updateByPrimaryKeySelective(NideshopComment record);

    int updateByPrimaryKey(NideshopComment record);
}