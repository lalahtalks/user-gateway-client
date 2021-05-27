package io.lalahtalks.user.gateway.client.http.contract;

import io.lalahtalks.spring.problem.ProblemType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.net.URI;

@RequiredArgsConstructor
@Getter
public enum UserGatewayProblemType implements ProblemType {

    ACCOUNT_ALREADY_EXISTS(
            URI.create("urn:lalahtalks:problem:user-gateway:account-already-exists"),
            "Account already exists",
            409),

    ;

    private final URI type;
    private final String title;
    private final int httpStatusCode;

}
