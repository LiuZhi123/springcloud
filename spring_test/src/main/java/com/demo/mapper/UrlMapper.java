package com.demo.mapper;

import com.demo.entity.Url;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UrlMapper {
    int insert(Url record);

    List<Url> selectAll();

    Url getByShort(String shortUrl);
}