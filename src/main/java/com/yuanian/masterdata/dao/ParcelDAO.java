package com.yuanian.masterdata.dao;

import com.yuanian.masterdata.entity.Parcel;
import com.yuanian.masterdata.entity.ParcelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelDAO {

    int deleteAll();

    int insert(Parcel record);

    int insertSelective(Parcel record);

    List<Parcel> selectByExample(ParcelExample example);

    int updateByExampleSelective(@Param("record") Parcel record, @Param("example") ParcelExample example);

    int updateByExample(@Param("record") Parcel record, @Param("example") ParcelExample example);
}