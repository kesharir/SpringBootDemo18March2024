package com.in28minutes.rest.webservices.restfulwebservices.advancedRestAPI.customizingResponsesFilteringAndMore;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Filter;

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

    @GetMapping("dynamic-filtering")
    public MappingJacksonValue dynamicFiltering() {
        SomeBean someBean = new SomeBean("v1", "v2", "v3", "v4");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field3");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }
    // Request:
    /**
     * http://localhost:8080/dynamic-filtering
     */
    // Response:
    /**
     * {
     * "field1": "v1",
     * "field3": "v3"
     * }
     */

    @GetMapping("dynamic-filtering-list")
    public MappingJacksonValue dynamicfilteringList() {
        List<SomeBean> list = Arrays.asList(
            new SomeBean("v1", "v2", "v3", "v4"),
            new SomeBean("v11", "v22", "v33", "v44")
        );
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }

    // Request:
    // http://localhost:8080/dynamic-filtering-list

    // Response:
    /**
     * [
     * {
     * "field2": "v2",
     * "field3": "v3"
     * },
     * {
     * "field2": "v22",
     * "field3": "v33"
     * }
     * ]
     */
}
