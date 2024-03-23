package com.in28minutes.rest.webservices.restfulwebservices.advancedRestAPI.customizingResponsesFilteringAndMore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SomeBean filtering() {
        return new SomeBean("value1", "value2", "value3", "value4");
    }

    @GetMapping("/filtering-list")
    public List<SomeBean> filteringList() {
        return List.of(
            new SomeBean("value1", "value2", "value3", "value4"),
            new SomeBean("value11", "value22", "value33", "value44"),
            new SomeBean("value111", "value222", "value333", "value444")
        );
    }
}
