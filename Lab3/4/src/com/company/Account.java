package com.company;

public class Account {
    int id,summ;

    public Account(int id, int summ) {
        this.id = id;
        this.summ = summ;
    }
    public int getId() {
        return id;
    }

    public int getSumm() {
        return summ;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", summ=" + summ +
                '}';
    }
}
