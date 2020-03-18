package com.kk.userinterface.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * @Author: kk
 * @Date: 2020-03-18 17:00
 */

@RestController
@RequestMapping("/session")
public class RedisSessionController {

    @RequestMapping("/uid")
    public String sessionAction(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        System.out.println("get " + uid);
        if (uid == null) {
            System.out.println("start set " + uid);
            uid = UUID.randomUUID();
        }
        System.out.println("set " + uid);
        session.setAttribute("uid", uid);
        return session.getId();
    }
}
