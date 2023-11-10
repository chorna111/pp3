public class Clock {
    private int hour;
    private int minute;
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        if(hour>0&&hour<=23){
            this.hour = hour;

        }else{
            System.out.println("Invalid hour value");
        }
    }
        public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        if(hour>0&&hour<=59){
            this.minute = minute;

        }else{
            System.out.println("Invalid minute value");
        }
    }
    public Clock(int hour,int minute){
        this.hour = (hour >= 0 && hour <= 23) ? hour : 0;
        this.minute = (minute >= 0 && minute <= 59) ? minute : 0;

    }
    public void addMinute(){
        this.minute+=1;
        if(this.minute==60){
            this.hour++;
            this.minute=0;
            if(this.hour==24){
                this.hour=0;
            }
        }

    }
    public String toString(){
        return String.format("%02d:%02d",this.hour,this.minute);
    }
    public static void main(String[] args) {
        Clock clock1=new Clock(2,59);
        System.out.println(clock1);
        clock1.addMinute();
        System.out.println(clock1);
        clock1.addMinute();
        System.out.println(clock1);
        Clock clock2=new Clock(23,59);
        clock2.addMinute();
        System.out.println(clock2);
        clock2.addMinute();
        System.out.println(clock2);
        Clock clock3=new Clock(24,60);
        clock3.setHour(24);
        System.out.println(clock3);

    }
    
    
}
