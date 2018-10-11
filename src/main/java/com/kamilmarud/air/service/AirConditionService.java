package com.kamilmarud.air.service;

import com.kamilmarud.air.dto.AirConditionDto;

import java.util.List;

public interface AirConditionService {
    List<AirConditionDto> getAllAirConditions();
    AirConditionDto getAirConditionById(String id);
}
