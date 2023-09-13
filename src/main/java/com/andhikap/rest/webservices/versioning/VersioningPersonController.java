package com.andhikap.rest.webservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

//    URI VERSIONING * TWITTER
    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson(){
        return new PersonV1("Andhika Prameswara");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson(){

        return new PersonV2(new Name("Andhika", "Prameswara"));
    }

//    REQUEST PARAMETER VERSIONING * AMAZON
    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getFirstVersionOfPersonRequestParameter(){
        return new PersonV1("Andhika Prameswara");
    }


    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getSecondVersionOfPersonRequestParameter(){
        return new PersonV2(new Name("Andhika", "Prameswara"));
    }

//     CUSTOM HEADER VERSIONING * MICROSOFT
    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public PersonV2 getFirstVersionOfPersonRequestHeader(){
        return new PersonV2(new Name("Andhika", "Prameswara"));
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionOfPersonRequestHeader(){
        return new PersonV2(new Name("Andhika", "Prameswara"));
    }




}
