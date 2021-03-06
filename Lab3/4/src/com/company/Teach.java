package com.company;
import java.util.Arrays;

public class Teach {
    int idTeach;
    int idCours;
    String FIO;
    Student[] students = new Student[2];
    public Teach(int idTeach, int idCours) {
        this.idTeach = idTeach;
        this.idCours = idCours;
        this.FIO = idTeach+" "+idTeach+" "+idTeach;
        for (int i = 0; i < 2; i++) {
            students[i] = new Student(idCours,idTeach,i);
        }
    }
    @Override
    public String toString() {
        return "Teach{" +
                "idTeach=" + idTeach +
                ", idCours=" + idCours +
                ", FIO='" + FIO + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
