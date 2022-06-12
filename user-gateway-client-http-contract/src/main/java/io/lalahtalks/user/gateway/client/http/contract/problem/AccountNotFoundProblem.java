package io.lalahtalks.user.gateway.client.http.contract.problem;

import static org.zalando.problem.Status.NOT_FOUND;

public final class AccountNotFoundProblem extends UserGatewayProblem {

    static final String TYPE = TYPE_PREFIX + "account-not-found";
    private static final String TITLE = "Account not found";

    public AccountNotFoundProblem(String detail) {
        super(TYPE, TITLE, NOT_FOUND, detail);
    }

}
