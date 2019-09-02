package com.yuanian.masterdata.dao;

import com.yuanian.masterdata.entity.NcCompany;
import com.yuanian.masterdata.entity.NcCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NcCompanyDAO {
    int deleteByPrimaryKey(String pkOrg);

    int insert(NcCompany record);

    int insertSelective(NcCompany record);

    List<NcCompany> selectByExample(NcCompanyExample example);

    NcCompany selectByPrimaryKey(String pkOrg);

    int updateByExampleSelective(@Param("record") NcCompany record, @Param("example") NcCompanyExample example);

    int updateByExample(@Param("record") NcCompany record, @Param("example") NcCompanyExample example);

    int updateByPrimaryKeySelective(NcCompany record);

    int updateByPrimaryKey(NcCompany record);
}