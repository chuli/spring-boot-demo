package com.kk.domain.service.mq;

import com.kk.domain.entity.Goods;
import com.kk.infrastructure.config.mq.TopicConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @Author: kk
 * @Date: 2020-03-12 16:25
 */

@Slf4j
@Component
public class TopicSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendTopicQueue() {
        amqpTemplate.convertAndSend(TopicConfig.TOPIC_EXCHANGE, TopicConfig.ROUTING_KEY_MSG, buildGoods1());
        amqpTemplate.convertAndSend(TopicConfig.TOPIC_EXCHANGE, TopicConfig.ROUTING_KEY_MSG2, buildGoods2());
    }

    private Goods buildGoods1() {
        Goods goods = new Goods();
        goods.setGoodsId(System.currentTimeMillis());
        goods.setGoodsName("topic goods name1");
        goods.setGoodsIntroduce("this is just for topic test");
        goods.setGoodsPrice(BigDecimal.valueOf(66.66));

        return goods;
    }

    private Goods buildGoods2() {
        Goods goods = new Goods();
        goods.setGoodsId(System.currentTimeMillis());
        goods.setGoodsName("topic goods name2");
        goods.setGoodsIntroduce("this is just for topic test");
        goods.setGoodsPrice(BigDecimal.valueOf(88.88));

        return goods;
    }
}
