package com.company;

public class Encyclopedia extends Book {

    public Encyclopedia() {
        this.setCode(2343);
        this.setYear(2020);
        this.setAuthor("Somebody");
        this.setName("Animal");
        this.setHouse("23");
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
        return "Encyclopedia{" +
                "code=" + code +
                ", year=" + year +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}
