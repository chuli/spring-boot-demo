package com.kk.domain.service.mq;

import com.kk.domain.entity.Goods;
import com.kk.infrastructure.config.mq.DirectConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @Author: kk
 * @Date: 2020-03-12 15:21
 */

@Component
public class DirectSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendDirectQueue() {
        this.amqpTemplate.convertAndSend(DirectConfig.DIRECT_QUEUE, buildGoods());
    }

    private Goods buildGoods() {
        Goods goods = new Goods();
        goods.setGoodsId(System.currentTimeMillis());
        goods.setGoodsName("test goods name");
        goods.setGoodsIntroduce("this is just for test");
        goods.setGoodsPrice(BigDecimal.valueOf(99.99));

        return goods;
    }
}
