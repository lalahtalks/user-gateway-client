package io.lalahtalks.user.gateway.client.dto.secret;

import com.fasterxml.jackson.annotation.JsonProperty;

public record SecretCreationRequestDto(
        @JsonProperty("encoded") SecretEncodedDto encoded) {

}
