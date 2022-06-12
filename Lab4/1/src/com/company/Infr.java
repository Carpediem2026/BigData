package com.company;

public class Infr {
    String prosp, street, square, nameCity;


    public Infr(String nameCity) {
        this.nameCity = nameCity;
        this.prosp = nameCity+", prospect:1,2,3,4,5";
        this.street = prosp+", street: number, kv";
        this.square = nameCity+", square:1,2";
    }

    @Override
    public String toString() {
        return "Infr{" +
                "prosp='" + prosp + '\'' +
                ", street='" + street + '\'' +
                ", square='" + square + '\'' +
                '}';
    }
}
