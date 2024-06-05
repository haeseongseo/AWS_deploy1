package com.lec.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j          // Java 코드에서 반복적으로 작성되는 코드를 자동으로 생성해주는 라이브러리
@RestController
public class HomeController {

    @GetMapping("/aws/v1")
    public String hello(@RequestParam(defaultValue = "1") Integer num){           // parameter 는 num 으로 받음
            if (num == 1){      // info 로그  (http://localhost:8080/aws/v1)
                log.info("/aws/v1 호출. info 로그 ###########################################");
            } else if (num == -1) {     // error 로그 (http://localhost:8080/aws/v1?num=-1)
                log.error("/aws/v1 호출. error 로그 ###########################################");
            } else if (num == 0) {      // warn 로그 (http://localhost:8080/aws/v1?num=0)
                log.warn("/aws/v1 호출. warn 로그 ###########################################");
//                log.debug();      // log 종류는 4가지임
            }

            return "<h1>AWS 배포 v1</h1>";
    }

}
