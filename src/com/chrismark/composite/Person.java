/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chrismark.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris
 */
public class Person {

    private String name;
    private int age;
    private List<Person> descendants;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        descendants = new ArrayList();
    }

    public List<Person> getDescendants() {

        System.out.println(this instanceof Parent ? " **** Family head details ****\n -> name: "
                + this.name + " | age: " + this.age + "\n    with descendants details: " 
                : "\n**** a kid can't have any descendants ");

        return descendants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addDescendant(Person person) {

        descendants.add(person);

    }

    public void printFamily() {

        getDescendants().forEach(System.out::println);

    }

    @Override
    public String toString() {
        return " -> Person{" + "name=" + name + ", age=" + age + ", descendants=" + descendants + '}';
    }

}
