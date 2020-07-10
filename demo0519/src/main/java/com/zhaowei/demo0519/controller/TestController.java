package com.zhaowei.demo0519.controller;

import com.zhaowei.demo0519.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService TestService;

    @Autowired
    private RedisTemplate redisTemplate;


    @RequestMapping("test")
    public void test() {


        boolean flag = false;

        if(!flag){
            System.out.println("------------------------------------------------------------");
        }



       /* Test test = new Test();
        test.setName("as");
        test.setAge("as");

        ArrayList<Test> objects = new ArrayList<>();

        List<Order> lists = objects.get(0).getLists();
        Order order = new Order();
        order.setName("张三");
        lists.add(order);
*/

    }



}
