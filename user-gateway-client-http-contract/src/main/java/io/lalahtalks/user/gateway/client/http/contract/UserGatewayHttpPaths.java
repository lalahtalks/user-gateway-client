package io.lalahtalks.user.gateway.client.http.contract;

import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class UserGatewayHttpPaths {

    public static final String ACCOUNTS_PATH = "/accounts";
    public static final String MINE_PATH = "/mine";
    public static final String MY_ACCOUNT_PATH = ACCOUNTS_PATH + MINE_PATH;

}
