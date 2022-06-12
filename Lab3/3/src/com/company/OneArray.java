package com.company;
//import java.util.Array;

import java.util.ArrayList;
import java.util.Objects;

public class OneArray{
    int lenghtArray;
    //int[] array = new int[lenghtArray];
    ArrayList<Integer> summ = new ArrayList<Integer>();
    ArrayList<Integer> del = new ArrayList<Integer>();
    ArrayList<Integer> mno = new ArrayList<Integer>();

    void create (){
        int[] array = new int[lenghtArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 50) - 20);
            //System.out.print(array[i]+" ");
            this.print(array[i]);
            this.algbr(i,array[i]);
        }
        System.out.println(" ");
        System.out.println("Сумма - "+summ);
        System.out.println("Разница - "+del);
        System.out.println("произведение - "+mno);

    }
    public void print (int a){
        System.out.print(a+" ");
    }
    public void algbr(int i,int a){
        summ.add(i,(a+10));
        del.add(i,(a-100));
        mno.add(i,(a*5));
    }

    public OneArray(int lenghtArray) {
        this.lenghtArray = lenghtArray;
        this.create();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OneArray)) return false;
        OneArray oneArray = (OneArray) o;
        return lenghtArray == oneArray.lenghtArray && Objects.equals(summ, oneArray.summ) && Objects.equals(del, oneArray.del) && Objects.equals(mno, oneArray.mno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lenghtArray);
    }
}
