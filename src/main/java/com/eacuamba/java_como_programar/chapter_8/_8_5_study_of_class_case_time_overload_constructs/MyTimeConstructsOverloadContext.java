package com.eacuamba.java_como_programar.chapter_8._8_5_study_of_class_case_time_overload_constructs;

public class MyTimeConstructsOverloadContext {
    public static void main (String args[]){
        MyTimeConstructsOverload myTimeConstructsOverload = new MyTimeConstructsOverload();
        MyTimeConstructsOverload myTimeConstructsOverload1 = new MyTimeConstructsOverload(20);
        MyTimeConstructsOverload myTimeConstructsOverload2 = new MyTimeConstructsOverload(20, 30);
        MyTimeConstructsOverload myTimeConstructsOverload3 = new MyTimeConstructsOverload(17, 20, 48);
        MyTimeConstructsOverload myTimeConstructsOverload4 = new MyTimeConstructsOverload(myTimeConstructsOverload3);


        displayTime(myTimeConstructsOverload, "Constructor without data!");
        displayTime(myTimeConstructsOverload1, "Constructor with hour!");
        displayTime(myTimeConstructsOverload2, "Constructor with hour, minute!");
        displayTime(myTimeConstructsOverload3, "Constructor with hour, minutte, second!");
        displayTime(myTimeConstructsOverload4, "Constructor with other object myTimeConstructsOverload3!");

        MyTimeConstructsOverload myTimeConstructsOverload5 = new MyTimeConstructsOverload(200, 500, 300);
        displayTime(myTimeConstructsOverload5, "Constructor with other wrong data!");

    }

    public static void displayTime(MyTimeConstructsOverload time, String message){
        System.out.printf("%n***** %s ******%n", message);
        System.out.printf("%s", time.toUniversalString());
        System.out.printf("%n**** %s ******%n", "Finnished print");
    }
}
