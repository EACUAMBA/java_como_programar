package com.eacuamba.java_como_programar.chapter_8._8_4_referencing_members_of_the_actually_object_with_reference_this;

public class ThisContext {
    public static void main(String... args){
        SimpleTime st= new SimpleTime(13, 13, 20);
    }
}
class SimpleTime{
    private int hour, minute, second;
    public SimpleTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String buildString(){
        return  String.format("%n%s%n%s%n%s", "Printing time using a method with this. and not.", this.toUniversalString(), toUniversalString());
    }

    public String toUniversalString(){
        return this.hour + ":" + this.minute + ":" + this.second;
    }
}
