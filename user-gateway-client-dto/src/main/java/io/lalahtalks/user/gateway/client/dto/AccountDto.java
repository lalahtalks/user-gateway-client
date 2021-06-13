package io.lalahtalks.user.gateway.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

import java.time.Instant;

@Value
@Builder
public class AccountDto {

    @JsonProperty("id")
    String id;

    @JsonProperty("email")
    String email;

    @JsonProperty("username")
    String username;

    @JsonProperty("createdAt")
    Instant createdAt;

}
