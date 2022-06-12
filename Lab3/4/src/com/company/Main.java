package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	Построить модель программной системы.
    1. Система Факультатив. Преподаватель объявляет запись на Курс.
    Студент записывается на Курс, обучается и по окончании Преподаватель выставляет Оценку,
    которая сохраняется в Архиве. Студентов, Преподавателей и Курсов при обучении может быть несколько.
    2. Система Платежи. Клиент имеет Счет в банке и Кредитную Карту (КК).
    Клиент может оплатить Заказ, сделать платеж на другой Счет, заблокировать КК и аннулировать Счет.
    Администратор может заблокировать КК за превышение кредита.
	 */
        System.out.println("------------------------------");
        System.out.println("Вариант 4.1");
        int m =2;
        Cours[] cours = new Cours[m];
        for (int i = 0; i < m; i++) {
            cours[i] = new Cours(i);
            cours[i].createfile();
        }

        System.out.println("------------------------------");
        System.out.println("Вариант 4.2");
        Client client = new Client("Client 123",123);
        client.status();
        client.pay(1000);
        client.status();
        client.payto(100);
        client.status();
        client.blockKKandNULL();
        client.status();
    }
}
