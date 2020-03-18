package com.kk.userinterface.controller;

import com.kk.domain.service.mq.DirectSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kk
 * @Date: 2020-03-12 15:32
 */

@RestController
@RequestMapping("/mq")
public class DirectController {

    @Autowired
    private DirectSender directSender;

    @RequestMapping("/directsend")
    public void directSendAction() {
        directSender.sendDirectQueue();
    }
}
