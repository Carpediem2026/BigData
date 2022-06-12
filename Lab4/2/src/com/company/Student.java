package com.company;

public abstract class Student implements Applicant{
    String fio,kyrs,forma;
    int year,summ_ex,id;

    public abstract void setFio(String fio);

    public void setKyrs(String kyrs) {
        this.kyrs = kyrs;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setSumm_ex(int summ_ex) {
        this.summ_ex = summ_ex;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }
}
