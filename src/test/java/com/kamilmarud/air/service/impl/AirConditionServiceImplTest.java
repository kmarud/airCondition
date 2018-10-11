package com.kamilmarud.air.service.impl;

import com.kamilmarud.air.dto.AirConditionDto;
import com.kamilmarud.air.dto.AirConditionDtoList;
import com.kamilmarud.air.dto.CityDto;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AirConditionServiceImplTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private AirConditionServiceImpl service;

    private AirConditionDto testObject;

    private AirConditionDtoList list;

    @Before
    public void setUp(){
        final String id = "1";
        final String address = "address";
        final String latitude = "51.56234";
        final String longitude = "17.432";
        final CityDto city = new CityDto("2", "Wroclaw");
        testObject = new AirConditionDto(id, address, latitude, longitude, city);
        list = new AirConditionDtoList(Arrays.asList(testObject));
    }

//    @Test
//    public void shouldGetAirConditionById() {
//        //given
//
//
//        //when
//        AirConditionDto airCondition = service.getAirConditionById(id);
//
//        //then
//        assertThat(airCondition.getId()).isEqualTo(airConditionDto.getId());
//    }

    @Test
    public void shouldGetAllAirConditions() {
        //given
        when(restTemplate.getForObject(anyString(), eq(AirConditionDtoList.class))).thenReturn(list);

        //when
        List<AirConditionDto> airCondition = service.getAllAirConditions();

        //then
        assertThat(airCondition).contains(testObject);
//        assertThat(airCondition.getId()).isEqualTo(airConditionDto.getId());
    }
}