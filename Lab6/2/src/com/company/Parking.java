package com.company;


import java.util.*;

public class Parking {
    HashMap<Integer,Boolean> place = new HashMap<>();
    public Parking(HashMap<Integer, Boolean> place) {
        this.place = place;
    }
    void in_car(){
        int i = 0;
        do {
            if (this.place.get(i)){
                i++;
            } else {
                this.place.replace(i,true);
                break;
            }
        }while (!this.place.isEmpty());
        System.out.println("Место "+i+" занято");
        //System.out.println(this.place);
    }
    void car_out (int num){
        if (num > this.place.size()){
            System.out.println("Такого места нет");
        }
        else {
            this.place.replace(num,false);
            System.out.println("Место "+num+" свободно");
            //System.out.println(this.place);
        }

    }


    @Override
    public String toString() {
        return "Parking - "
                + place ;
    }
}
