package com.demo.mapper;

import com.demo.entity.MFaq;
import java.util.List;

public interface MFaqMapper {
    int deleteByPrimaryKey(String id);

    int insert(MFaq record);

    MFaq selectByPrimaryKey(String id);

    List<MFaq> selectAll();

    int updateByPrimaryKey(MFaq record);
}