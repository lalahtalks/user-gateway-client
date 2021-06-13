package io.lalahtalks.user.gateway.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AccountCreationRequestDto {

    @JsonProperty("email")
    String email;

    @JsonProperty("username")
    String username;

    @JsonProperty("password")
    String password;

}
