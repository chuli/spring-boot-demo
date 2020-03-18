package com.kk.domain.service.mq;

import com.kk.domain.entity.Goods;
import com.kk.infrastructure.config.mq.TopicConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: kk
 * @Date: 2020-03-12 16:38
 */

@Slf4j
@Component
public class TopicReceiver {

    @RabbitListener(queues = TopicConfig.TOPIC_QUEUE1)
    public void receiveTopic1(Goods goods) {
        log.info("receive topic1 msg is " + goods.toString());
    }

    @RabbitListener(queues = TopicConfig.TOPIC_QUEUE2)
    public void receiveTopic2(Goods goods) {
        log.info("receive topic2 msg is " + goods.toString());
    }
}
