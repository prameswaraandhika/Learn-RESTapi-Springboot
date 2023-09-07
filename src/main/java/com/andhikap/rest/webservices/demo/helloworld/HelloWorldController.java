package com.andhikap.rest.webservices.demo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-dhika")
    public String helloWorld() {
        return "Hello Andhika, Semangat ya!";
    }

    // @GetMapping(path = "/hello-dhika-bean")
    // public HelloDhikaBean helloWorldBean() {
    // return new HelloDhikaBean("Hello Andhika, Semangat ya!");
    // }

    // @GetMapping(path = "/hello-dhika/path-variable/{name}")
    // public HelloDhikaBean helloWorldBean(@PathVariable String name) {
    // return new HelloDhikaBean(String.format("Hello %s, Semangat ya %s!", name,
    // name));
    // }

    // @GetMapping(path = "/hello-dhika/path-variable/{name}")
    // public HelloDhikaBean helloDhikaBean(@PathVariable String name) {
    // return new HelloDhikaBean(String.format("Halo %s, Semangat ye %s", name,
    // name));
    // }
    @GetMapping(path = "/hello-dhika/{name}/{age}")
    public HelloDhikaBean getHelloDhikaBean(
            @PathVariable String nama,
            @PathVariable int age) {
        return new HelloDhikaBean(String.format("Halo %s, Umur saya %d ", nama, age));
    }
}
