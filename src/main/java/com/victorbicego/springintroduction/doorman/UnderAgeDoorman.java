package com.victorbicego.springintroduction.doorman;

import com.victorbicego.springintroduction.Person;
import com.victorbicego.springintroduction.rejectedlist.SimpleRejectedList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UnderAgeDoorman implements Doorman {

    @Autowired
    private SimpleRejectedList rejectedList;

    @Override
    public List<Person> control(List<Person> personsList) {
        List<Person> approvedPersons = new ArrayList<>();

        for (Person person : personsList) {
            if (person.getAge() >= 18) {
                approvedPersons.add(person);
            } else {
                rejectedList.addRejected(person);
            }
        }

        return approvedPersons;
    }

}
