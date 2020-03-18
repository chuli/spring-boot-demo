package com.kk.userinterface.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kk
 * @Date: 2020-03-11 14:36
 */

@RestController
@Slf4j
public class IndexController {

    @RequestMapping()
    public String indexAction() {
        String logStr = "start logback demo success !!!";
        log.info(logStr);
        return logStr;
    }
}
