package com.kamilmarud.air.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter @Setter
public class AirConditionDtoList {
    private List<AirConditionDto> list;
}
