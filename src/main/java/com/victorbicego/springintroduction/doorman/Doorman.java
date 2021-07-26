package com.victorbicego.springintroduction.doorman;

import com.victorbicego.springintroduction.Person;

import java.util.List;

public interface Doorman {

    List<Person> control(List<Person> persons);

}
