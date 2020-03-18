package com.kk.domain.service.mq;

import com.kk.domain.entity.Goods;
import com.kk.infrastructure.config.mq.FanoutConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: kk
 * @Date: 2020-03-12 16:50
 */

@Slf4j
@Component
public class FanoutReceiver {

    @RabbitListener(queues = FanoutConfig.FANOUT_QUEUE1)
    public void receiveFanout1(Goods goods) {
        log.info("receive fanout queue1 msg " + goods.toString());
    }

    @RabbitListener(queues = FanoutConfig.FANOUT_QUEUE2)
    public void receiveFanout2(Goods goods) {
        log.info("receive fanout queue2 msg " + goods.toString());
    }
}
