package com.kk.userinterface.controller;

import com.kk.domain.service.mq.TopicSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kk
 * @Date: 2020-03-12 16:39
 */

@RestController
@RequestMapping("/mq")
public class TopicController {

    @Autowired
    private TopicSender topicSender;

    @RequestMapping("/topicsend")
    public void topicSenderAction() {
        topicSender.sendTopicQueue();
    }
}
