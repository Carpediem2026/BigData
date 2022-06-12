package com.company;

public class Correspondence_Student extends Student{


    public Correspondence_Student() {
        this.setFio("SName Name !");
        this.setForma("Corr");
        this.setId(12);
        this.setKyrs("Information");
        this.setSumm_ex(227);
        this.setYear(2006);
    }


    @Override
    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "Correspondence_Student{" +
                "fio='" + fio + '\'' +
                ", year=" + year +
                ", id=" + id +
                ", kyrs='" + kyrs + '\'' +
                ", forma='" + forma + '\'' +
                ", summ_ex=" + summ_ex +
                '}';
    }
}
