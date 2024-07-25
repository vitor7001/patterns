package com.vitor.nullobject;

public class RouterFactory {
    public static Router getRouterForMessage(Message msg) {
        return new NullRouter();
    }
}
