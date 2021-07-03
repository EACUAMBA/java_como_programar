package chapter_8._8_5_study_of_class_case_time_overload_constructs;

public class MyTimeConstructsOverload {
    private int hour;
    private int minute;
    private int second;

    public MyTimeConstructsOverload(){
        this(0,0,0);
    }
    public MyTimeConstructsOverload(int hour){
        this(hour, 0, 0);
    }
    public MyTimeConstructsOverload(int hour, int minute){
        this(hour, minute, 0);
    }
    public MyTimeConstructsOverload(int hour, int minute, int second){
        this.setTime(hour, minute, second);
    }

    public MyTimeConstructsOverload(MyTimeConstructsOverload myTimeConstructsOverload){
        this(myTimeConstructsOverload.getHour(), myTimeConstructsOverload.minute, myTimeConstructsOverload.second);
    }

    public void setTime(int hour, int minute, int second){
        if(hour <0 || hour >= 24
        || minute < 0 || minute >=60
        || second<0 || second >=60){
            throw new IllegalArgumentException("Hora, minuto ou segundo fora do intervalo permitido.");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
    public String toString(){
        return String.format("%02d:%02d:%02d %s",
                (this.hour == 0 || this.hour == 12 ? 12 : this.getHour() % 12 ),
                this.minute,
                this.second,
                (this.getHour() > 12 ? "PM" : "AM")
                );

    }
}
