package com.andhikap.rest.webservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFilter("SomeUserFilter")
public record SomeUser(String username,  String password,  String repassword)  {
}
