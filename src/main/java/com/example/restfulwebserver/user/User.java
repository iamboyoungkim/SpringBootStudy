package com.example.restfulwebserver.user;

import java.util.Date;

// lombok
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class User {
    private int id;
    private String name;
    private Date joinDate;
}
