package com.company;

public class MyVector {
    int x,y;

    public MyVector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyVector() {
        this.x = (int) Math.random();
        this.y = (int) Math.random();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    void oper(MyVector v2){
        System.out.println("Сумма. Вектор С с координатами: ["+(x+ v2.getX())+","+(y+v2.getY())+"]");
        System.out.println("Разность. Вектор С с координатами: ["+(x- v2.getX())+","+(y-v2.getY())+"]");
        System.out.println("Умножение. Скалярное произведение векторов: "+(x*v2.getX()+y*v2.getY()));
    }

    void incdec (){
        System.out.println("Инкремент - ["+(x+1)+","+(y+1)+"]");
        System.out.println("Декремент - ["+(x-1)+","+(y-1)+"]");
        System.out.println("Умножение вектора на число - ["+(x*2)+","+(y*2)+"]");
    }
    void len (){
        System.out.println("Длина(модуль) вектора - "+Math.sqrt(x*x+y*y));
    }
    void cos (MyVector v2){
        double up,down,cos;
        up = x*v2.getX()+y*v2.getY();
        down = Math.sqrt(x*x+y*y)*Math.sqrt(v2.getX()*v2.getX()+ v2.getY()* v2.getY());
        cos = up/down;
        System.out.println("Угол между векторами - "+cos);
    }
    void kolort (MyVector v2){
        System.out.println("Коллинеарность и ортогональность: ");
        double up,down,cos;
        int skalar = x*v2.getX()+y*v2.getY();
        if (skalar < 0.01){
            System.out.println("Вектора коллинеарны");
        }
        else
            System.out.println("Вектора не коллинеарны ");
        up = x*v2.getX()+y*v2.getY();
        down = Math.sqrt(x*x+y*y)*Math.sqrt(v2.getX()*v2.getX()+ v2.getY()* v2.getY());
        cos = up/down;
        if (cos == 0){
            System.out.println("Вектора ортогональны");
        }
        else
            System.out.println("Вектора не ортогональны");
    }

}





