package io.lalahtalks.user.gateway.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AccountCreationRequestDto(
        @JsonProperty("email") String email,
        @JsonProperty("username") String username,
        @JsonProperty("password") String password) {

}
