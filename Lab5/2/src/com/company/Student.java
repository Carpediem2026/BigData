package com.company;

import java.util.Scanner;

public class Student {
//Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
    int id;
    String surname,name,patronymic,date,adr,tel,faculty,course,group;

    public Student(int id) {
        Scanner in = new Scanner(System.in);
        setId(id);
        System.out.print("Введите фамилию студента - ");
        setSurname(in.nextLine());
        System.out.print("Введите имя студента - ");
        setName(in.nextLine());
        System.out.print("Введите отчество студента - ");
        setPatronymic(in.nextLine());
        System.out.print("Введите дату рождения студента - ");
        setDate(in.nextLine());
        System.out.print("Введите адрес студента - ");
        setAdr(in.nextLine());
        System.out.print("Введите телефон студента - ");
        setTel(in.nextLine());
        System.out.print("Введите факультет студента - ");
        setFaculty(in.nextLine());
        System.out.print("Введите курс студента - ");
        setCourse(in.nextLine());
        System.out.print("Введите группу студента - ");
        setGroup(in.nextLine());
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", date='" + date + '\'' +
                ", adr='" + adr + '\'' +
                ", tel='" + tel + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
    public int getId() {
        return id;
    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public String getDate() {
        return date;
    }
    public String getAdr() {
        return adr;
    }
    public String getTel() {
        return tel;
    }
    public String getFaculty() {
        return faculty;
    }
    public String getCourse() {
        return course;
    }
    public String getGroup() {
        return group;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setAdr(String adr) {
        this.adr = adr;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setGroup(String group) {
        this.group = group;
    }
}
