package com.company;
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> read_file (){
        String pathname = "/ooooooooooyyyyyyyyyyyyyyy/1.2/JAVA/Lab5/4/src/com/company/Java.txt";
        ArrayList<String> list = new ArrayList<>();

        try {
            File readfile = new File(pathname);
            if (readfile.exists()){
                FileReader fr = new FileReader(readfile);
                Scanner scannerfile = new Scanner(fr);
                while(scannerfile.hasNextLine()) {
                    list.add(scannerfile.nextLine());
                }
                fr.close();
            }else{
                System.out.println("Not file");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void write_file (ArrayList<String> list,String pathname){
        File writefile = new File(pathname);
        if (writefile.exists()){
            try {
                FileWriter fr = new FileWriter(writefile, false);
                for (int i = 0; i<list.size(); i++){
                    fr.write(list.get(i)+"\n");
                }
                fr.flush();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Файл дополнен.");
        }
        else {
            System.out.println("Problem");
        }
    }

    public static void main(String[] args) {
	/*
	Вариант 4
При выполнении следующих заданий для вывода результатов создавать новую директорию и файл средствами класса File
1.	Прочитать текст Java-программы и все слова public в объявлении атрибутов и методов класса заменить
на слово private.
2.	Прочитать текст Java-программы и записать в другой файл в обратном порядке символы каждой строки.
	 */
        ArrayList<String> file;
        file = read_file();
        System.out.println("------------------------");
        System.out.println("№ 1");
        ArrayList<String> for_new_file1 = new ArrayList<>();
        for (int i = 0; i<file.size(); i++){
            for_new_file1.add(file.get(i).replace("public","private"));
        }
        write_file(for_new_file1,"/ooooooooooyyyyyyyyyyyyyyy/1.2/JAVA/Lab5/4/src/com/company/New_file1.txt");
        System.out.println("------------------------");
        System.out.println("№ 2");
        ArrayList<String> for_new_file2 = new ArrayList<>();
        for (int i = 0; i<file.size(); i++){
            String obr_str = new StringBuffer(file.get(i)).reverse().toString();
            for_new_file2.add(obr_str);
        }
        write_file(for_new_file2,"/ooooooooooyyyyyyyyyyyyyyy/1.2/JAVA/Lab5/4/src/com/company/New_file2.txt");
    }
}
