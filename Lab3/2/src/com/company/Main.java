package com.company;
import java.util.*;
import com.company.Student;
import com.company.Customer;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	/*
	Вариант 2
    Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
    Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные на консоль.
    1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа. Создать массив объектов.
    Вывести: a) список студентов заданного факультета; b) списки студентов для каждого факультета и курса;
    c) список студентов, родившихся после заданного года; d) список учебной группы.
    2. Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета. Создать массив объектов.
    Вывести: a) список покупателей в алфавитном порядке; b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
	 */
        System.out.println("------------------------------");
        System.out.println("Вариант 2.1");
        System.out.print("Введите количество студентов - ");
        int n = in.nextInt();
        ArrayList<Student> students = new ArrayList<Student>();
        for (int i = 0; i < n; i++) {
            students.add(new Student(i));
        }
        System.out.println("Студенты 1-го факультета:");
        for (Student s : students){
            if(s.getFaculty().equals("1")){
                System.out.println(s.toString());
            }
        }
        System.out.println("Список студентов факультета 1 курса 1:");
        for(Student s : students){
            if(s.getFaculty().equals("1")&s.getCourse().equals("1")){
                System.out.println(s.toString());}
        }


        System.out.println("------------------------------");
        System.out.println("Вариант 2.2");
        System.out.print("Введите количество Customer - ");
        int n2 = in.nextInt();
        ArrayList<Customer>  customers= new ArrayList<Customer>();
        for (int i = 0; i < n2; i++) {
            customers.add(new Customer(i));
    }
        System.out.println("a) список покупателей в алфавитном порядке:");
        Collections.reverse(customers);
        System.out.println(customers);
        System.out.println("b) список покупателей, у которых номер кредитной карточки находится в заданном интервале:");
        for (Customer c : customers) {
            if (c.getNum_card() >= 1 && c.getNum_card() <= 3){
                System.out.println(c.toString());}
        }

    }
}
