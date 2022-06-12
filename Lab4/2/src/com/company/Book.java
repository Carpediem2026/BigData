package com.company;

public abstract class Book {
    int code,year;
    String name,author,house;
    public abstract void setCode(int code);
    public abstract void setYear(int year);
    public abstract void setName(String name);
    public abstract void setAuthor(String author);
    public abstract void setHouse(String house);
}
