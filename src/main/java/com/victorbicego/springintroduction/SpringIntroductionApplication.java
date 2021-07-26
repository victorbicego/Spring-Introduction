package com.victorbicego.springintroduction;

import com.victorbicego.springintroduction.doorman.HealthDoorman;
import com.victorbicego.springintroduction.doorman.UnderAgeDoorman;
import com.victorbicego.springintroduction.rejectedlist.SimpleRejectedList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringIntroductionApplication implements CommandLineRunner {

    public SpringIntroductionApplication(SimpleRejectedList simpleRejectedList, UnderAgeDoorman underAgeDoorman, HealthDoorman healthDoorman) {
        this.simpleRejectedList = simpleRejectedList;
        this.underAgeDoorman = underAgeDoorman;
        this.healthDoorman = healthDoorman;
    }

    SimpleRejectedList simpleRejectedList;
    UnderAgeDoorman underAgeDoorman;
    HealthDoorman healthDoorman;

    public static void main(String[] args) {
        SpringApplication.run(SpringIntroductionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Person person1 = new Person("Alex", 33, true);
        Person person2 = new Person("Maria", 28, false);
        Person person3 = new Person("Thomas", 15, true);
        Person person4 = new Person("Nina", 14, false);

        List<Person> personsList = new ArrayList<>(List.of(person1, person2, person3, person4));

        System.out.println("--------------------");
        System.out.println(healthDoorman.control(personsList));
        System.out.println("--------------------");
        simpleRejectedList.printRejected();
        System.out.println("--------------------");

        System.out.println(underAgeDoorman.control(personsList));
        System.out.println("--------------------");
        simpleRejectedList.printRejected();
        System.out.println("--------------------");

    }
}
