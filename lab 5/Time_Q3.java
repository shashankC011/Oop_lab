class Time{
    int hour;
    int min;
    int sec;
    Time(){
        hour = 0;
        min = -1;
        sec = -1;
    }
    Time(int hour,int min,int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    void display_Time(){
        System.out.println(hour +":"+min+ ":"+sec);
    }
    static Time add(Time t1,Time t2){       //static so we can assign it to a new instance variable without having to pass that instance a constructor
        int totalSeconds = (t1.hour *3600 + t1.min*60 + t1.sec)+(t2.hour *3600 + t2.min*60 + t2.sec); 
        int hours = totalSeconds /3600;
        int mins = (totalSeconds%3600)/60;
        int sec = (totalSeconds%60);
        return new Time(hours,mins,sec);
    }
}
class Time_Q3{
    public static void main(String[] args) {
        Time t1 = new Time(16,35,10);
        Time t2 = new Time(2,20,5);
        Time t3 = Time.add(t1, t2);
        t1.display_Time();
        t3.display_Time();
    }
}