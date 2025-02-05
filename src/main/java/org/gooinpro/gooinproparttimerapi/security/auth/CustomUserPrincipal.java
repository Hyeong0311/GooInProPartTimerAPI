package org.gooinpro.gooinproparttimerapi.security.auth;

import java.security.Principal;

public class CustomUserPrincipal implements Principal {

    private final String email;

    public CustomUserPrincipal(String email) {

        this.email = email;
    }

    @Override
    public String getName() {

        return email;
    }
}
