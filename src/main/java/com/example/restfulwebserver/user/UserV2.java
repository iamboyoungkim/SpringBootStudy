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
@JsonFilter("UserInfoV2")

public class UserV2 extends User {
    private String grade;
}
