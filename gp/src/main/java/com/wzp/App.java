package com.wzp;

/**
 * @Author:wzp
 * @Description:
 * @Date:Created in 13:04 2020/2/7
 * @Version:1.0
 */
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@EnableAutoConfiguration
@SpringBootApplication
public class App {

    public static void main(String args[]){
        SpringApplication.run(App.class, args);
        System.out.println("-----start-----");
    }
}
