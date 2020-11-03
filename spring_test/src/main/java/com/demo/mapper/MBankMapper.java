package com.demo.mapper;

import com.demo.entity.MBank;
import java.util.List;

public interface MBankMapper {
    int deleteByPrimaryKey(String id);

    int insert(MBank record);

    MBank selectByPrimaryKey(String id);

    List<MBank> selectAll();

    int updateByPrimaryKey(MBank record);
}