package com.demo.service.impl;

import com.demo.entity.Url;
import com.demo.mapper.UrlMapper;
import com.demo.service.shortUrlService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class shortUrlImpl implements shortUrlService {
    @Resource
    private UrlMapper urlMapper;
    @Override
    public Url getByShort(String shortUrl) {
        return urlMapper.getByShort(shortUrl);
    }
    @Override
    public void insert(Url url){
        urlMapper.insert(url);
    };
}
