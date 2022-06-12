package com.company;
import java.io.IOException;
import com.company.TextFile;
import com.company.OneArray;


public class Main {

    public static void main(String[] args) {
	/*
	Вариант 3
    Создать приложение, удовлетворяющее требованиям, приведенным в задании.
    Аргументировать принадлежность классу каждого создаваемого метода и корректно переопределить для каждого класса методы equals(), hashCode(), toString().
    1.	Создать объект класса Текстовый файл, используя класс Файл. Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
    2.	Создать объект класса Одномерный массив, используя класс Массив. Методы: создать, вывести на консоль, выполнить операции (сложить, вычесть, перемножить).
	 */
        //Scanner in = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Вариант 3.1");
        TextFile file = new TextFile("/Users/63462/Downloads/files.txt");
        System.out.println(file);
        file.rename();
        System.out.println(file);
        try {
            file.write();
            file.print();
        } catch (IOException e){
            System.out.println("no print/ no write");
        }
        System.out.println(" ");
        file.delFile();
        System.out.println("------------------------------");
        System.out.println("Вариант 3.2");
        OneArray myarr = new OneArray(10);

    }
}
