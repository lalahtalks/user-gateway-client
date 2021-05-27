package io.lalahtalks.user.gateway.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountCreationRequestDto {

    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

}
