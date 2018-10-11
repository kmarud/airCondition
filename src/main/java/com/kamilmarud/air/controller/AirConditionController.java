package com.kamilmarud.air.controller;

import com.kamilmarud.air.dto.AirConditionDto;
import com.kamilmarud.air.service.AirConditionService;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.pl.PESEL;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("air")
@RequiredArgsConstructor
public class AirConditionController {

    private final AirConditionService service;
//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();

    @GetMapping("{id}")
    public AirConditionDto getAirConditionById(@PathVariable String id) {
        return null;
    }
}
