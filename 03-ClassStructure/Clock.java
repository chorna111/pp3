public class Clock {
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    public Clock(){
        hour=0;
        minute=0;
    }
    public Clock(int hour,int minute){
        this.hour=hour;
        this.minute=minute;
    }
    public void setClock(int hour,int minute){
        if(hour>=0&&hour<=23){
            this.hour=hour;

        }
        if(minute>=0&&minute<=59){
            this.minute=minute;

        }


    }
    public void setClock(){
        this.hour=0;
        this.minute=0;
    }
    public void displayTime(){
        System.out.printf("The time is %02d:%02d%n",hour,minute);
    }
    public void addOneMinute(){
        if(this.minute>=0&&this.minute<=59){
            this.minute+=1;
            if(this.minute>59){
                this.hour+=1;
                this.minute=0;
                if(this.hour>23){
                    this.hour=0;
                }
            }
        }
        runAlarm();
    }
    public void setAlarm(int hour,int minute){
        this.alarmHour=hour;
        this.alarmMinute=minute;


    }
    public void runAlarm(){
        if(this.hour==alarmHour&&this.minute==alarmMinute){
            System.out.println("beep-beep-beep-beep");

        }else{
            System.out.println("No alarms");
        }
        
        
    }
    public static void main(String[] args) {
        Clock clock1=new Clock(12,47);
        clock1.setAlarm(23, 59);
        
        clock1.displayTime();
        clock1.setClock(18,14);
        clock1.displayTime();
        clock1.setClock(9, 3);
        clock1.displayTime();
        clock1.setClock(23,58);
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
  
    }
}
