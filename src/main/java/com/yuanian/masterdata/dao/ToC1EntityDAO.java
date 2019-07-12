package com.yuanian.masterdata.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ToC1EntityDAO {

    Integer selectNum();
    List<Map<String,Object>> selectPage(@Param("startIndex") int startIndex,@Param("endIndex") int endIndex);
    void chargeData();
}