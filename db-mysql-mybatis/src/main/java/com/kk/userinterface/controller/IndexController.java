package com.kk.userinterface.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kk
 * @Date: 2020-03-06 17:00
 */

@RestController
public class IndexController {

    @RequestMapping()
    public String indexAction() {
        return "success!!!";
    }
}
