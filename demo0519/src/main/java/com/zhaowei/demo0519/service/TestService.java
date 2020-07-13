package com.zhaowei.demo0519.service;

import com.zhaowei.demo0519.entity.Test;
import com.zhaowei.demo0519.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Service
public class TestService {

    @Autowired
    TestMapper TestMapper;

    public List<Test> selectList() {
       return TestMapper.selectList();
    }

    public void insertInto(@RequestParam Test test) {
        TestMapper.insertInto(test);
    }
}
