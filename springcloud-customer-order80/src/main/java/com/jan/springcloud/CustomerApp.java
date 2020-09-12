package com.jan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Jan
 * @version 1.0.0
 * @createTime 2020年09月12日 22:27:00
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class CustomerApp {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApp.class);
    }

}
