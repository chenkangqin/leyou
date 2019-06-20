package com.macro.mall.mapper;

import com.macro.mall.model.NideshopHelpIssue;
import com.macro.mall.model.NideshopHelpIssueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NideshopHelpIssueMapper {
    int countByExample(NideshopHelpIssueExample example);

    int deleteByExample(NideshopHelpIssueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NideshopHelpIssue record);

    int insertSelective(NideshopHelpIssue record);

    List<NideshopHelpIssue> selectByExample(NideshopHelpIssueExample example);

    NideshopHelpIssue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NideshopHelpIssue record, @Param("example") NideshopHelpIssueExample example);

    int updateByExample(@Param("record") NideshopHelpIssue record, @Param("example") NideshopHelpIssueExample example);

    int updateByPrimaryKeySelective(NideshopHelpIssue record);

    int updateByPrimaryKey(NideshopHelpIssue record);
}