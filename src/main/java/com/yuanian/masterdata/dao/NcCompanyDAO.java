package com.yuanian.masterdata.dao;

import com.yuanian.masterdata.entity.NcCompany;
import com.yuanian.masterdata.entity.NcCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NcCompanyDAO {
    int insert(NcCompany record);

    int insertSelective(NcCompany record);

    List<NcCompany> selectByExample(NcCompanyExample example);

    int updateByExampleSelective(@Param("record") NcCompany record, @Param("example") NcCompanyExample example);

    int updateByExample(@Param("record") NcCompany record, @Param("example") NcCompanyExample example);
}