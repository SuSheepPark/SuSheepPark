package com.zhaowei.demo0519.controller;

public class DelayQueueDemo {

    public static void main(String[] args)  throws InterruptedException {
       /* Order order1 = new Order("Order1", (long) 5, TimeUnit.SECONDS);
        Order order2 = new Order("Order2", (long) 10, TimeUnit.SECONDS);
        Order order3 = new Order("Order3", (long) 15, TimeUnit.SECONDS);

        DelayQueue<Order> delayeds = new DelayQueue<>();
        delayeds.put(order1);
        delayeds.put(order2);
        delayeds.put(order3);

        System.out.println("订单队列开始时间:"+ new Date());
        while(delayeds.size() != 0){
            Order poll = delayeds.poll();
            if(poll != null){
                System.out.format("订单:{%s}被取消, 取消时间:{%s}\n",poll.getClass().getName(),new Date());
            }
            Thread.sleep(100);
        }*/
    }
}
