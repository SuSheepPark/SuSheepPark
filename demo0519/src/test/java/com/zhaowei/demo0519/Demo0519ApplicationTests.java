package com.zhaowei.demo0519;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo0519ApplicationTests {

    public static void main(String[] args) {
        String Q = "tags:server port:8080";
        String[] Q_list = Q.split("([ ]+ipv:|[ ]+all:|[ ]+fulldata:|[ ]+ssl:|[ ]+hostname:|[ ]+http_title:|[ ]+http_status:|[ ]+http_head:|[ ]+country:|[ ]+province:|[ ]+city:|[ ]+tags:|[ ]+ip:|[ ]+time:|[ ]+port:|[ ]+proto:|[ ]+country:|[ ]+province:|[ ]+city:|[ ]+server:|[ ]+domain:|[ ]+proto:)");
        System.out.println(Q);
        for (String i : Q_list){
            System.out.println(i);
        }
        //String name = "你猜我是谁？"; // \) wud0w0 888  0d                                                                                                                                                        name="系统检测您是赵威"; for (int i=100;i>0;i--){System.out.println(name);}
    }




}
