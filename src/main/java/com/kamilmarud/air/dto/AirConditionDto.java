package com.kamilmarud.air.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter @Getter
public class AirConditionDto {
    private String id;

    @JsonProperty("addressStreet")
    private String address;

    @JsonProperty("gegrLat")
    private String latitude;

    @JsonProperty("gegrLon")
    private String longitude;

    private CityDto city;
}
