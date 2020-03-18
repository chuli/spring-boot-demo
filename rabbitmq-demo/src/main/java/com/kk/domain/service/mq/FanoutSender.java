package com.kk.domain.service.mq;

import com.kk.domain.entity.Goods;
import com.kk.infrastructure.config.mq.FanoutConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @Author: kk
 * @Date: 2020-03-12 16:48
 */

@Component
public class FanoutSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendFanoutQueue() {
        amqpTemplate.convertAndSend(FanoutConfig.FANOUT_EXCHANGE, "", buildGoods());
    }

    private Goods buildGoods() {
        Goods goods = new Goods();
        goods.setGoodsId(System.currentTimeMillis());
        goods.setGoodsName("fanout goods name");
        goods.setGoodsIntroduce("this is just for test fanout");
        goods.setGoodsPrice(BigDecimal.valueOf(99.99));

        return goods;
    }
}
