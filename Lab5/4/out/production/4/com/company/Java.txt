package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static ArrayList<String> choose_enter(int choose){
        ArrayList<String> list = new ArrayList<>();
        switch (choose){
            case 0:
                Scanner in = new Scanner(System.in);
                System.out.println("Введите имя начального файла (пункт 1)");
                list.add(in.nextLine());
                System.out.println("Введите абсолютный путь к начальному файлу (пункт 1)");
                list.add(in.nextLine());
                System.out.println("Введите имя начального файла (пункт 2)");
                list.add(in.nextLine());
                System.out.println("Введите абсолютный путь к начальному файлу (пункт 2)");
                list.add(in.nextLine());
                System.out.println("Введите имя нового файла (пункт 1)");
                list.add(in.nextLine());
                System.out.println("Введите абсолютный путь к новому файлу (пункт 1)");
                list.add(in.nextLine());
                System.out.println("Введите имя нового файла (пункт 2)");
                list.add(in.nextLine());
                System.out.println("Введите абсолютный путь к новому файлу (пункт 2)");
                list.add(in.nextLine());
                break;
            case 1:
                try {
                    File filepath = new File("/ooooooooooyyyyyyyyyyyyyyy/1.2/JAVA/Lab5/3/src/com/company/Pathname.txt");
                    FileReader fr = new FileReader(filepath);
                    Scanner scannerfile = new Scanner(fr);
                    while(scannerfile.hasNextLine()) {
                        list.add(scannerfile.nextLine());
                    }
                    fr.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Неправильный ввод параметров!");
                break;

        }
        return list;
    }

    public static ArrayList<String> read_file (String pathname){
        ArrayList<String> list = new ArrayList<>();
        try {
            File readfile = new File(pathname);
            FileReader fr = new FileReader(readfile);
            Scanner scannerfile = new Scanner(fr);
            while(scannerfile.hasNextLine()) {
                list.add(scannerfile.nextLine());
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void write_file (ArrayList<String> list,String pathname){
        File writefile = new File(pathname);
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

    public static void main(String[] args) {
	/*
	В следующих заданиях требуется ввести последовательность строк из текстового потока и выполнить указанные действия.
	При этом могут рассматриваться два варианта:
    • каждая строка состоит из одного слова;
    • каждая строка состоит из нескольких слов.
    Имена входного и выходного файлов, а также абсолютный путь к ним могут быть введены как параметры командной строки или храниться в файле.
    1. В каждой строке найти и удалить заданную подстроку.
    2.  В каждой строке стихотворения Александра Блока найти и заменить заданную подстроку на подстроку иной длины.
	 */
        ArrayList<String> data,string_of_file,string_of_file2;
        ArrayList<String> for_new_file = new ArrayList<>();
        ArrayList<String> for_new_file2 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Выберете способ введения имен входного и выходного файлов, а также абсолютный путь к ним: 0 - введение вручную; 1 - из файла");
        int choose = in.nextInt();
        data = choose_enter(choose);
        System.out.println("------------------------");
        System.out.println("№ 1");
        string_of_file = read_file(data.get(1));
        System.out.println(string_of_file);
        for (int i = 0; i<string_of_file.size(); i++){
            for_new_file.add(string_of_file.get(i).replace("один",""));
        }
        write_file(for_new_file,data.get(5));
        System.out.println("------------------------");
        System.out.println("№ 2");
        string_of_file2 = read_file(data.get(3));
        for (int i = 0; i<string_of_file2.size(); i++){
            for_new_file2.add(string_of_file2.get(i).replace("фонарь","фонарик123456789"));
        }
        write_file(for_new_file2,data.get(7));
    }
}