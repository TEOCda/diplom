package com.cloud.back.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
public class UserDto {
  //  @NotBlank
    @JsonProperty("login")
    private String login;
    //@NotBlank
    @JsonProperty("password")
    private String password;

    public UserDto(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "AuthRequest{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}