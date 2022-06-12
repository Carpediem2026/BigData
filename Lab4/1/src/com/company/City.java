package com.company;

public class City {
    int idCity;
    String nameCity;
    Infr infrCity;

    public City(int idCity, String nameCity) {
        this.idCity = idCity;
        this.nameCity = nameCity;
        infrCity = new Infr(this.nameCity);
    }

    @Override
    public String toString() {
        return "City{" +
                "idCity=" + idCity +
                ", nameCity='" + nameCity + '\'' +
                ", infrCity=" + infrCity +
                '}';
    }
}
