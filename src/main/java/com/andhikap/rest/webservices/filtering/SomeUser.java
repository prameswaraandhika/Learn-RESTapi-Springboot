package com.andhikap.rest.webservices.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;

public record SomeUser(String username, @JsonIgnore String password, @JsonIgnore String repassword)  {
}
