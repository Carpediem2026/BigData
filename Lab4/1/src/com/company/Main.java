package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	Вариант 1
1.	Создать класс City (город) с внутренним классом, с помощью объектов которого можно
хранить информацию о проспектах, улицах, площадях.
2.	Создать класс CD (mp3-диск) с внутренним классом, с помощью объектов которого можно
хранить информацию о каталогах, подкаталогах и записях.
	 */
        City city = new City(0,"Moscow");
        System.out.println(city);
        CD cd = new CD(0);
        System.out.println(cd);
    }
}
