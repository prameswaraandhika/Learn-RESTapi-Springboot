package com.andhikap.rest.webservices.filtering;


import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public MappingJacksonValue filtering(){
        SomeUser someUser = new SomeUser("andhika", "andhikap", "andhikap1");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someUser);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("username", "password");
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SomeUserFilter", filter);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }

    @GetMapping("/filtering-list")
    public MappingJacksonValue filteringList(){
        List<SomeUser> someUsers = Arrays.asList(
                new SomeUser("andhikap","andhikap", "andhikap"),
                new SomeUser("james","james1", "james1"),
                new SomeUser("veronica","veronica1", "veronica1"));
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someUsers);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("username", "password");
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SomeUserFilter", filter);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }
}
