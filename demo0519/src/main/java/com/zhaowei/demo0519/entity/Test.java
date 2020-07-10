package com.zhaowei.demo0519.entity;

import com.zhaowei.demo0519.utils.ExportEntityMap;

import java.util.List;


public class Test {

    @ExportEntityMap(CnName="编号",EnName="id")
    private Integer id;//编号
    @ExportEntityMap(CnName="姓名",EnName="name")
    private String name;
    @ExportEntityMap(CnName="年龄",EnName="age")
    private String age;

    private List<Order> lists;


    public String getAge() {
        return age;
    }

    public List<Order> getLists() {
        return lists;
    }

    public void setLists(List<Order> lists) {
        this.lists = lists;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge(String s) {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
