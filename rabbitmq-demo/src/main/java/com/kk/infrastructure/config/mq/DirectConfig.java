package com.kk.infrastructure.config.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kk
 * @Date: 2020-03-12 15:18
 */

@Configuration
public class DirectConfig {

    public static final String DIRECT_QUEUE = "direct.queue.test";

    @Bean
    public Queue directQueue() {
        /**
         * args0 队列名字
         * args1 是否持久化
         */
        return new Queue(DIRECT_QUEUE, true);
    }
}
