package com.kk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: kk
 * @Date: 2020-03-11 14:32
 */

@Slf4j
@SpringBootApplication
public class LogbackConfigDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogbackConfigDemoApplication.class, args);
        log.info("logback demo start success ...");
    }
}
