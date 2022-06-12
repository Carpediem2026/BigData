package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	/*
	Вариант 2
1.	На базе коллекций реализовать структуру хранения чисел с поддержкой следующих операций:
• добавление/удаление числа;
• поиск числа, наиболее близкого к заданному (т.е. модуль разницы минимален).
2.	Реализовать класс, моделирующий работу N-местной автостоянки.
Машина подъезжает к определенному месту и едет вправо, пока не встретится свободное место.
Класс должен поддерживать методы, обслуживающие приезд и отъезд машины.
	 */
        System.out.println("------------------------------");
        System.out.println("№ 1");
        ArrayList<Integer> number = new ArrayList<>();
        int kolvo = 10;
        for (int i = 0; i<kolvo; i++){
            number.add((int) (Math.random() * 100));
        }
        System.out.println("Числа - "+number);
        System.out.println("Если хотите добавить число введите - 1. Если хотите удалить число введите - 2. Если хотите найти близкое число введите - 3.");
        Scanner in = new Scanner(System.in);
        int choo = in.nextInt();
        switch (choo){
            case 1:
                System.out.println("Введите число, которое хотите добавить в коллекцию: ");
                int num_add = in.nextInt();
                number.add(num_add);
                System.out.println("Число введено.");
                System.out.println("Числа после операции - "+number);
                break;
            case 2:
                System.out.println("Введите число, которое хотите удалить из коллекции: ");
                int num_del = in.nextInt();
                number.removeIf(p -> p.equals(num_del));
                System.out.println("Число удалено.");
                System.out.println("Числа после операции - "+number);
                break;
            case 3:
                System.out.println("Введите число, которое хотите найти в коллекции: ");
                int num_find = in.nextInt();
                Collections.sort(number);
                int max =0;
                int min =0;
                for (int i=0;i<number.size();i++){
                    if (num_find >= number.get(i)){
                        max = i;
                    }
                    else {
                        min = i;
                    }
                }
                if(Math.abs(num_find-number.get(max)) > Math.abs(num_find-number.get(min))){
                    System.out.println("Близкое число - " + number.get(min));
                } else {
                    System.out.println("Близкое число - " + number.get(max));
                }
                break;
            default:
                System.out.println("Неправильный ввод");
        }
        System.out.println("------------------------------");
        System.out.println("№ 2");
        HashMap<Integer,Boolean> place = new HashMap<>();
        for (int i = 0; i<kolvo; i++){
            place.put(i,false);
        }
        System.out.println(place);
        Parking my_parking = new Parking(place);
        my_parking.in_car();
        my_parking.in_car();
        my_parking.car_out(1);
        my_parking.in_car();
        System.out.println(my_parking);
    }
}
