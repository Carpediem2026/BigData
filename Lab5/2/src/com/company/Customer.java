package com.company;

public class Customer {
    //Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
    int id,num_card,num_sch,surname,name,patronymic,adr;

    public Customer(int id) {
        setId(id);
        setNum_card(id);
        setNum_sch(id);
        setSurname(id);
        setName(id);
        setPatronymic(id);
        setAdr(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname=" + surname +
                ", name=" + name +
                ", patronymic=" + patronymic +
                ", adr=" + adr +
                ", num_card=" + num_card +
                ", num_sch=" + num_sch +
                '}';
    }
    public int getId() {
        return id;
    }
    public int getNum_card() {
        return num_card;
    }
    public int getNum_sch() {
        return num_sch;
    }
    public int getSurname() {
        return surname;
    }
    public int getName() {
        return name;
    }
    public int getPatronymic() {
        return patronymic;
    }
    public int getAdr() {
        return adr;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNum_card(int num_card) {
        this.num_card = num_card;
    }
    public void setNum_sch(int num_sch) {
        this.num_sch = num_sch;
    }
    public void setSurname(int surname) {
        this.surname = surname;
    }
    public void setName(int name) {
        this.name = name;
    }
    public void setPatronymic(int patronymic) {
        this.patronymic = patronymic;
    }
    public void setAdr(int adr) {
        this.adr = adr;
    }
}
