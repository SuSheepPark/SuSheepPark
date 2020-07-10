package com.zhaowei.demo0519.mapper;

import com.zhaowei.demo0519.entity.Test;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {

    /*@Select("select * from test")*/
    List<Test> selectList();

    void insertInto(Test test);
}
