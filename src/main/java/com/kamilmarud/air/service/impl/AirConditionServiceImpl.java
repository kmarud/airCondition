package com.kamilmarud.air.service.impl;

import com.kamilmarud.air.dto.AirConditionDto;
import com.kamilmarud.air.dto.AirConditionDtoList;
import com.kamilmarud.air.service.AirConditionService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
@RequiredArgsConstructor
public class AirConditionServiceImpl implements AirConditionService {

    private final RestTemplate restTemplate;

    @Override
    public List<AirConditionDto> getAllAirConditions() {
        final String url = "http://api.gios.gov.pl/pjp-api/rest/station/findAll";
        AirConditionDtoList list = restTemplate.getForObject(url, AirConditionDtoList.class);
        return list.getList();
//        ResponseEntity<List<AirConditionDto>> response = restTemplate.exchange(
//                url,
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<AirConditionDto>>(){});
//        return response.getBody();
    }

    @Override
    public AirConditionDto getAirConditionById(String id) {
        return null;
//        final String url = "http://api.gios.gov.pl/pjp-api/rest/station/findAll";
//        ResponseEntity<List<AirConditionDto>> response = restTemplate.exchange(
//                url,
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<AirConditionDto>>(){});
//        List<AirConditionDto> list = response.getBody();
    }
}
