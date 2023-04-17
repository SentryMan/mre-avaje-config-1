package org.example.bug;

import io.avaje.config.Config;

public final class Launcher {
    public static void main(String[] args) {
        final var m = Config.get("name");
        System.out.println("Hello: " + m);
    }
}
