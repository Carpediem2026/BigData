package com.company;

public class People {
    String name;
    Integer age;
    Sex pol;

    public People(String name, Integer age, Sex pol) {
        this.name = name;
        this.age = age;
        this.pol = pol;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Sex getPol() {
        return pol;
    }
}
