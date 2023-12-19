public class Test {
    public static void main(String[] args) {
        TV t=new TV();
        System.out.println(t);
        t.on();
        System.out.println(t);
        t.setChannel(7);
        System.out.println(t);
        System.out.println(t.setChannel(142));
        System.out.println(t);
        System.out.println(t.volumeDown());
        t.volumeUp();
        t.volumeUp();
        System.out.println(t);
        t.volumeDown();
        System.out.println(t);



    }
    
}
