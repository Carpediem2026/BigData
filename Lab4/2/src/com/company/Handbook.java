package com.company;

public class Handbook extends Book{


    public Handbook() {
        this.setCode(1);
        this.setYear(2000);
        this.setAuthor("Franck Thilliez");
        this.setName("Puzzle");
        this.setHouse("123");
    }


    @Override
    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void setHouse(String house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Handbook{" +
                "code=" + code +
                ", year=" + year +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}
