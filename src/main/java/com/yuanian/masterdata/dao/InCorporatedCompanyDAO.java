package com.yuanian.masterdata.dao;

import com.yuanian.masterdata.entity.InCorporatedCompany;
import com.yuanian.masterdata.entity.InCorporatedCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface InCorporatedCompanyDAO {
    int insert(InCorporatedCompany record);

    int insertSelective(InCorporatedCompany record);

    List<InCorporatedCompany> selectByExample(InCorporatedCompanyExample example);

    int updateByExampleSelective(@Param("record") InCorporatedCompany record, @Param("example") InCorporatedCompanyExample example);

    int updateByExample(@Param("record") InCorporatedCompany record, @Param("example") InCorporatedCompanyExample example);
}