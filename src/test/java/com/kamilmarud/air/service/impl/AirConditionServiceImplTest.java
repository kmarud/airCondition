package com.kamilmarud.air.service.impl;

import com.kamilmarud.air.dto.AirConditionDto;
import com.kamilmarud.air.dto.CityDto;
import com.kamilmarud.air.service.AirConditionService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class AirConditionServiceImplTest {

    private AirConditionService service;
    @Before
    public void setUp(){
        service = new AirConditionServiceImpl();
    }

    @Test
    public void shouldGetAirConditionById() {
        //given
        final String id = "1";
        final String address = "address";
        final String latitude = "51.56234";
        final String longitude = "17.432";
        final CityDto city = new CityDto("2", "Wroclaw");
        final AirConditionDto airConditionDto = new AirConditionDto(id, address, latitude, longitude, city);

        //when
        AirConditionDto airCondition = service.getAirConditionById(id);

        //then
        assertThat(airCondition.getId()).isEqualTo(airConditionDto.getId());
    }
}