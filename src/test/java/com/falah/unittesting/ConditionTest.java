package com.falah.unittesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

public class ConditionTest {

    @Test
    public void systemProperties() {
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> System.out.println(key + ": " + value));

    }

    @Test
    @EnabledOnOs(value = {OS.WINDOWS})
    public void onWindows() {
        System.out.println("Running on Windows OS");
    }

    @Test
    @DisabledOnOs(value = {OS.WINDOWS})
    public void onLinux() {
        System.out.println("Running on Linux OS");
    }

    @Test
    @EnabledOnJre(value = {JRE.JAVA_11})
    public void onJava11() {
        System.out.println("Running on Linux OS");
    }

    @Test
    @DisabledOnJre(value = {JRE.JAVA_11})
    public void onJava8() {
        System.out.println("Running on Linux OS");
    }
}
