package com.macro.mall.mapper;

import com.macro.mall.model.NideshopGoodsIssue;
import com.macro.mall.model.NideshopGoodsIssueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopGoodsIssueMapper {
    int countByExample(NideshopGoodsIssueExample example);

    int deleteByExample(NideshopGoodsIssueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopGoodsIssue record);

    int insertSelective(NideshopGoodsIssue record);

    List<NideshopGoodsIssue> selectByExample(NideshopGoodsIssueExample example);

    NideshopGoodsIssue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopGoodsIssue record, @Param("example") NideshopGoodsIssueExample example);

    int updateByExample(@Param("record") NideshopGoodsIssue record, @Param("example") NideshopGoodsIssueExample example);

    int updateByPrimaryKeySelective(NideshopGoodsIssue record);

    int updateByPrimaryKey(NideshopGoodsIssue record);
}