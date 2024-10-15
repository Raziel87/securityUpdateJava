package com.example.demo;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @PostConstruct
  public void doSomethingAfterStartup() {
    KafkaSender kafkaSender = new KafkaSender();
    log.info("Start Ip Sprint Java Project...");
    kafkaSender.sendMessage();
  }

}
