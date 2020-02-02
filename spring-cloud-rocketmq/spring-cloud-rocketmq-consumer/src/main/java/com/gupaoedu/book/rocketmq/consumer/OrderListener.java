package com.gupaoedu.book.rocketmq.consumer;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author juede.tcever
 */
@Component
@RocketMQMessageListener(topic = "TopicOrder", consumerGroup = "CONSUMER_GROUP_ORDER")
public class OrderListener implements RocketMQListener<Order> {

    @Override
    public void onMessage(Order order) {
        // 调用数据库 update 库存表
    }
}
