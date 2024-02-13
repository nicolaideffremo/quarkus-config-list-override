package org.example;

import io.quarkus.runtime.annotations.StaticInitSafe;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithName;

import java.util.List;

@StaticInitSafe
@ConfigMapping(prefix = "greeting")
public interface GreetingConfig {

    @WithName("message")
    String message();

    @WithName("names")
    List<String> names();

    List<Language> languages();

    interface Language {

        @WithName("name")
        String name();

        @WithName("code")
        String code();
    }
}


