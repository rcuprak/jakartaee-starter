package org.ctjava.starter;

import jakarta.enterprise.inject.Model;

@Model
public class HelloWorldBean {

    public String getMessage() {
        return "Hello from a bean!";
    }
}
