package com.in28minutes.rest.webservices.restfulwebservices.advancedRestAPI.versioning;

public class PersonV1 {
    public PersonV1(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PersonV1{" +
                "name='" + name + '\'' +
                '}';
    }
}
