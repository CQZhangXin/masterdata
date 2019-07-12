package com.yuanian.masterdata.dao;

import com.yuanian.masterdata.entity.Log;
import org.springframework.stereotype.Repository;

@Repository
public interface LogDAO {
    int insert(Log record);

    int insertSelective(Log record);
}