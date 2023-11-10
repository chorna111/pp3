public class ClockTest {
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
