package com.company;

public class CD {
    Information infa;

    int idCd;

    public CD(int idCd) {
        this.idCd = idCd;
        infa = new Information(idCd);
        set_information();
    }

    void set_information(){
        infa.setCat("C: /fjkdg/jhfjk/");
        infa.setPodcat("/test.txt");
        infa.setZap("Information about zap");
    }

    @Override
    public String toString() {
        return "CD{" +
                "idCd=" + idCd +
                ", infa=" + infa +
                '}';
    }
}
