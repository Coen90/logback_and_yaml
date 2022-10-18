package com.coen.ymltest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class YmlTestApplication implements ApplicationListener<ApplicationReadyEvent> {

    @Value("${server.message}")
    String message;
    @Value("${server.codes}")
    String[] codes;

    public static void main(String[] args) {
        SpringApplication.run(YmlTestApplication.class, args);
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        log.debug("======================================================");
        log.debug("======================================================");
        log.debug("message=[{}]", message);
        log.debug("codes=[{}]", Arrays.toString(codes));
        log.debug("======================================================");
        log.debug("======================================================");
    }
}
