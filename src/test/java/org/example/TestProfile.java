package org.example;

import io.quarkus.test.junit.QuarkusTestProfile;

public class TestProfile implements QuarkusTestProfile {

    @Override
    public String getConfigProfile() {
       return "test,myprofile";
    }
}
