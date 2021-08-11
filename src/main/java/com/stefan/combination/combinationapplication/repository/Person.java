package com.stefan.combination.combinationapplication.repository;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class Person {

    private int id;
    private int height;
    private int weight;

    private String name;
    private Date birthDate;

    public int getId() {
        return id;
    }

    public Person() {

    }

    public Person(int id, int height, int weight, String name, Date birthDate) {
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
