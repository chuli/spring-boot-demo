package com.kk.domain.service.mq;

import com.kk.domain.entity.Goods;
import com.kk.infrastructure.config.mq.DirectConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: kk
 * @Date: 2020-03-12 15:28
 */

@Slf4j
@Component
public class DirectReceiver {

    @RabbitListener(queues = DirectConfig.DIRECT_QUEUE)
    public void receiverDirectQueue(Goods goods) {
        log.info("receive msg is " + goods.toString());
    }
}
