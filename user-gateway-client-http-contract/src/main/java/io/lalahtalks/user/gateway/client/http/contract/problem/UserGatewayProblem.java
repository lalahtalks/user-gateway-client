package io.lalahtalks.user.gateway.client.http.contract.problem;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

import java.net.URI;

import static com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = PROPERTY, property = "type", visible = true, defaultImpl = UnknownUserGatewayProblem.class)
@JsonSubTypes({
        @JsonSubTypes.Type(value = AccountAlreadyExistsProblem.class, name = AccountAlreadyExistsProblem.TYPE),
        @JsonSubTypes.Type(value = AccountNotFoundProblem.class, name = AccountNotFoundProblem.TYPE)})
public abstract class UserGatewayProblem extends AbstractThrowableProblem {

    static final String TYPE_PREFIX = "urn:lalahtalks:problem:user-gateway:";

    public UserGatewayProblem(String type, String title, Status status, String detail) {
        super(URI.create(type), title, status, detail);
    }

}
