package com.kk.userinterface.controller;

import com.kk.domain.service.mq.FanoutSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kk
 * @Date: 2020-03-12 16:52
 */

@RestController
@RequestMapping("/mq")
public class FanoutController {

    @Autowired
    private FanoutSender fanoutSender;

    @RequestMapping("/fanoutsender")
    public void fanoutSenderAction() {
        fanoutSender.sendFanoutQueue();
    }
}
