package com.ecommerce.priceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PriceServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(PriceServiceApplication.class, args);
  }

//  @Autowired
//  QueryUtil queryUtil;

//  @Bean
//  ApplicationListener<ApplicationReadyEvent> applicationReadyEventApplicationListener() {
//    return new ApplicationListener<ApplicationReadyEvent>() {
//      @Override
//      public void onApplicationEvent(ApplicationReadyEvent event) {
//        queryUtil.save();
//      }
//    };
//  }

}
