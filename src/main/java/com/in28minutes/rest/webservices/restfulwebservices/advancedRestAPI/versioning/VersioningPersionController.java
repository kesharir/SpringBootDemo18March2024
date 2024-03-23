package com.in28minutes.rest.webservices.restfulwebservices.advancedRestAPI.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersionController {
    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson() {
        return new PersonV1("Ritanshu Keshari");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson() {
        return new PersonV2(new Name("Ritanshu", "Keshari"));
    }

    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getFirstVersionOfPersonUsingRequestParams() {
        return new PersonV1("Ritanshu Keshari");
    }

    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getSecondVersionOfPersonUsingRequestParams() {
        return new PersonV2(new Name("Ritanshu", "Keshari"));
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonUsingRequestHeader() {
        return new PersonV1("Ritanshu Keshari");
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionOfPersonsUsingRequestHeader() {
        return new PersonV2(new Name("Ritanshu", "Keshari"));
    }

    @GetMapping(path = "person/accept", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getFirstVersionOfPersonUsingAcceptHeader() {
        return new PersonV1("Ritanshu Keshari");
    }

    @GetMapping(path = "person/accept", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getSecondVersionOfPersonUsingAcceptHeader() {
        return new PersonV2(new Name("Ritanshu", "Keshari"));
    }
}
