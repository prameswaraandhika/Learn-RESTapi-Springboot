package com.andhikap.rest.webservices.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SomeUser filtering(){
        return new SomeUser("andhikap","andhikap", "andhikap");
    }

    @GetMapping("/filtering-list")
    public List<SomeUser> filteringList(){
        return Arrays.asList(new SomeUser("andhikap","andhikap", "andhikap"),
                new SomeUser("james","james1", "james1"),
        new SomeUser("veronica1","veronica1", "veronica1"));
    }
}
