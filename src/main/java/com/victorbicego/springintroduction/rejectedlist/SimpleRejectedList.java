package com.victorbicego.springintroduction.rejectedlist;

import com.victorbicego.springintroduction.Person;
import com.victorbicego.springintroduction.rejectedlist.RejectedList;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SimpleRejectedList implements RejectedList {

    public List<Person> rejectedPersons = new ArrayList<>();

    @Override
    public void addRejected(Person person) {
        rejectedPersons.add(person);
    }

    @Override
    public void printRejected() {
        for (Person person : rejectedPersons) {
            System.out.println(person);
        }
    }
}
