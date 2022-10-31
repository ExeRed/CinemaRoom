package com.example.SpringT;

import java.util.UUID;

public class Token {

    UUID token;

    public Token() {}
    public Token(UUID token) {
        this.token = token;
    }

    public UUID getToken() {
        return token;
    }

    public void setToken(UUID token) {
        this.token = token;
    }
}
