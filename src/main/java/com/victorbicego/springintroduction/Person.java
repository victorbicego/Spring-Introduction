package com.victorbicego.springintroduction;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    private String name;
    private int age;
    private boolean isVaccinated;
}
