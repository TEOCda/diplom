package com.cloud.back.controller;

import com.cloud.back.dto.TokenDto;
import com.cloud.back.dto.UserDto;
import com.cloud.back.service.SecurityAuthService;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.*;
class AuthUserControllerTest {
    @Mock
    SecurityAuthService service;
    @Mock
    Logger log;
    @InjectMocks
    AuthUserController authUserController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testLogin(){
        when(service.geJwtTokenByLoginAndPassword(new UserDto("login", "password"))).thenReturn("geJwtTokenByLoginAndPasswordResponse");

        TokenDto result = authUserController.login(new UserDto("login", "password"));
        Assertions.assertEquals("geJwtTokenByLoginAndPasswordResponse", result.getToken());
    }

    @Test
    void testLogout(){
        when(service.deleteTokenAndLogout(anyString())).thenReturn(HttpStatus.OK);

        HttpStatus result = authUserController.logout("token");
        Assertions.assertEquals(HttpStatus.OK, result);
    }
}
