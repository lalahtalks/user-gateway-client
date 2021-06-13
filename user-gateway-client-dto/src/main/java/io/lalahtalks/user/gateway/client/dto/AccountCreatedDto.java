package io.lalahtalks.user.gateway.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

import java.time.Instant;

@Value
@Builder
public class AccountCreatedDto {

    @JsonProperty("accountId")
    String accountId;

    @JsonProperty("createdAt")
    Instant createdAt;

}
