package com.easy.learn.web.callApi;


import com.easy.learn.web.consts.ApiPath;
import com.easy.learn.web.dto.user.User;
import com.easy.learn.web.dto.user.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class UserCallService {
    @Value("${api.host.url}")
    String apiHostUrl;

    @Autowired
    RestTemplate restTemplate;

    public List<User> getAllUser() {
        String url = apiHostUrl+ ApiPath.USER_GET_ALL;
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<UserDTO> userResponse = restTemplate.exchange(url, HttpMethod.GET, entity, new ParameterizedTypeReference<UserDTO>() {});
        UserDTO userDTO = userResponse.getBody();
        return userDTO.getList();
    }
}
