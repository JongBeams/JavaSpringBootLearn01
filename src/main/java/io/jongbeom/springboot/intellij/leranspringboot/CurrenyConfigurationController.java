package io.jongbeom.springboot.intellij.leranspringboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


// http://localhost:8080/currency-configuration


@RestController
public class CurrenyConfigurationController {

    @Autowired
    private  CurrencyServiceConfiguration configuration;

    // Course 반환 목록 : id, name, author
    // URL /currency-configuration 입력 시 반환
    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllCourses(){
        return configuration;
    }





}
