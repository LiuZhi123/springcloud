package com.demo.service;

import com.demo.entity.Url;
import org.springframework.stereotype.Service;

public interface shortUrlService {
    public Url getByShort(String shortUrl);

    public void insert(Url url);
}
