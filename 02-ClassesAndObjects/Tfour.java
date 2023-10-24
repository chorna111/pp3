public class Tfour {
    public static void main(String[] args) {
        int hours=0;
        int minutes=53;
        
        int minutesSinceMidnight=hours*60+minutes;
        int secondsSinceMidnight=minutesSinceMidnight*60;
        System.out.printf("hours = %d%nminutes = %d%ntime: %d:%d%nminutes from midnight: %d%nseconds from midnight: %d%n",
        hours,minutes,hours,minutes,minutesSinceMidnight,secondsSinceMidnight);
    }
    
}
