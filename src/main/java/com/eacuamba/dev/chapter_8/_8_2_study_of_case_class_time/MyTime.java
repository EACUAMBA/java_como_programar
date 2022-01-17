package com.eacuamba.dev.chapter_8._8_2_study_of_case_class_time;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second){
        if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >=60 ){
            throw new IllegalArgumentException("Hora, minuto ou segundos fora do intervalo aceitavel.");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String getUniversalTime(){
        String time = null;

        time = this.hour + ":" + this.minute + ":" + this.second;

        return time;
    }

    public String getPatternTime(){
        String time = null;

        time = ((this.hour == 0 || this.hour == 12) ? 12 : this.hour % 12) + ":" + this.minute + ":" + this.second + " " + (this.hour < 12 ? "AM" : "PM");

        return time;
    }
}
