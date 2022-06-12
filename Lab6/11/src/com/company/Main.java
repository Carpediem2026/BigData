package com.company;

import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {

    public static double [] mnk(double [] X, double  [] Y, int n)
    {
        double sx2,sx,sy,sxy;
        double a,b,d,da,db;
        int i;
        sx2=sx=sy=sxy=0.0;
        for (i=0; i<n; i++)
        {
            sx+=X[i];
            sy+=Y[i];
            sx2+=X[i]*X[i];
            sxy+=X[i]*Y[i];
        }

        d=((double) n)*sx2-sx*sx;
        da=((double) n)*sxy-sx*sy;
        db=sx2*sy-sx*sxy;
        a=da/d;
        b=db/d;
        double [] res=new double[2];
        res[0]=a;
        res[1]=b;
        return res;
    }


    public static void main(String[] args) {
	/*
   Вариант 1
2. Списки (стеки, очереди) I(1..n) и U(1..n) содержат результаты n измерений тока и напряжения
на неизвестном сопротивлении R. Найти приближенное число R методом наименьших квадратов.
3. С использованием множества выполнить попарное суммирование произвольного конечного ряда чисел
по следующим правилам: на первом этапе суммируются попарно рядом стоящие числа,
на втором этапе суммируются результаты первого этапа и т.д. до тех пор, пока не останется одно число.
    */
        System.out.println("------------------------------");
        System.out.println("№ 2");
        double U[]={1.5,3,6,9};
        double I[]={0.2,0.4,0.8,1.2};
        double res[]=mnk(U,I,4);
        System.out.println("R="+1.0/res[0]);

        System.out.println("------------------------------");
        System.out.println("№ 3");
        HashSet<Integer> r1 = new HashSet<>();
        int k;

        for (int i = 0; i<5; i++){
            r1.add((int) (Math.random() * 50 + 5));
        }
        System.out.println(r1);
        Integer[] arr1 = r1.toArray(new Integer[r1.size()]);
        ArrayList<Integer> summ_old = new ArrayList<>();
        for (int i = 0; i<4; i++){
            summ_old.add(arr1[i]+arr1[i+1]);
        }
        System.out.println(summ_old);

        ArrayList<Integer> summ_new = new ArrayList<>();
        k = summ_old.size();
        while (k!=1){
            for (int i = 0; i<(k-1); i++){
                summ_new.add(summ_old.get(i)+summ_old.get(i+1));
            }
            summ_old.clear();
            summ_old.addAll(summ_new);
            System.out.println(summ_old);
            k = summ_new.size();
            summ_new.clear();
        }
        System.out.println("Results - "+summ_old);
    }
}


