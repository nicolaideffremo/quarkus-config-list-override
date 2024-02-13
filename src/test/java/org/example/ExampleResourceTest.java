package org.example;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
@TestProfile(org.example.TestProfile.class)
class ExampleResourceTest {

    @Inject
    GreetingConfig config;

    @Test
    void assert_config_list_override_with_strings() {

        Assertions.assertEquals(1, config.names().size());
        Assertions.assertEquals("CC", config.names().get(0));
    }

    @Test
    void assert_config_list_override_with_objects() {

        Assertions.assertEquals(1, config.languages().size());
        Assertions.assertEquals("IT", config.languages().get(0).name());
        Assertions.assertEquals("14", config.languages().get(0).code());
    }
}
