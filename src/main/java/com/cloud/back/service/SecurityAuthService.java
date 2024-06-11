package com.cloud.back.service;

import com.cloud.back.entity.User;
import com.cloud.back.dto.UserDto;
import org.springframework.http.HttpStatus;

public interface SecurityAuthService {
    String geJwtTokenByLoginAndPassword(UserDto userDto);
    HttpStatus deleteTokenAndLogout(String token);
    boolean validateUser(UserDto userDto, User user);
}
