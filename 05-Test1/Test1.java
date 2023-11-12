public class Test1 {
    public static void main(String[] args) {
        String t="Volvo";
        
        String first=t.substring(0,1);
        String last=t.substring(t.length()-1);
        int len=(t.substring(1, t.length()-1)).length();
        
        String replaced="*".repeat(len);
        System.out.println(first+replaced+last);
     
        






    }
}
        
    
        