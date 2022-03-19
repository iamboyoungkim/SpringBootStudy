package com.example.restfulwebserver.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok -> getter,setter 안써도 됨.

@Data
@AllArgsConstructor
@NoArgsConstructor

public class HelloWorldBean {
    private String message;    
}