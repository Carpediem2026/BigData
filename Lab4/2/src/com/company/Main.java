package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	Вариант 2
Реализовать абстрактные классы или интерфейсы, а также наследование и полиморфизм для следующих классов
1.	Абстрактный класс Книга (Шифр, Автор, Название, Год, Издательство). Подклассы Справочник и Энциклопедия.
2.	interface Абитуриент <- abstract class Студент <- class Студент-Заочник.
	 */
        Book book = new Handbook();
        System.out.println(book);
        Encyclopedia encyclopedia = new Encyclopedia();
        System.out.println(encyclopedia);
        System.out.println("-------------------------");
        Correspondence_Student student = new Correspondence_Student();
        System.out.println(student);

    }
}
