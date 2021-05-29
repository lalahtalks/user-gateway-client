package io.lalahtalks.user.gateway.client.http.contract;

import io.lalahtalks.spring.problem.ProblemType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.zalando.problem.Status;

import java.net.URI;

@RequiredArgsConstructor
@Getter
public enum UserGatewayProblemType implements ProblemType {

    ACCOUNT_NOT_FOUND(
            URI.create("urn:lalahtalks:problem:user-gateway:account-not-found"),
            "Account not found",
            Status.NOT_FOUND),

    ACCOUNT_ALREADY_EXISTS(
            URI.create("urn:lalahtalks:problem:user-gateway:account-already-exists"),
            "Account already exists",
            Status.CONFLICT),

    ;

    private final URI type;
    private final String title;
    private final Status httpStatus;

}
