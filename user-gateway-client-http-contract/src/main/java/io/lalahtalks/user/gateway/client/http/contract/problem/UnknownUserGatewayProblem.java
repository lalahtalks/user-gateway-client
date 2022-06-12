package io.lalahtalks.user.gateway.client.http.contract.problem;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.zalando.problem.Status;

public final class UnknownUserGatewayProblem extends UserGatewayProblem {

    @JsonCreator
    public UnknownUserGatewayProblem(
            @JsonProperty("type") String type,
            @JsonProperty("title") String title,
            @JsonProperty("status") Integer status,
            @JsonProperty("detail") String detail) {
        super(type, title, Status.valueOf(status), detail);
    }

}
