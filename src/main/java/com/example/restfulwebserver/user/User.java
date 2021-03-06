package com.example.restfulwebserver.user;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFilter;

// lombok
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
// @JsonIgnoreProperties(value={"password"})
@JsonFilter("UserInfo")

public class User {
    private int id;
    private String name;
    private Date joinDate;

    // @JsonIgnore
    private String password;
    // @JsonIgnore
    private String ssn;
}
