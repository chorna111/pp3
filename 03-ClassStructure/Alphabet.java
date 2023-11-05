
import java.util.Arrays;
public class Alphabet {
    public static boolean isA(String str){
        char alp[]=str.toCharArray();
        Arrays.sort(alp);
        String a=String.valueOf(alp);
        if(a.trim().equals(str.trim())){
            return true;

        }else{

            return false;
        
        }
    
    }
    public static void main(String[] args) {
        System.out.println(isA("abegsw"));
        System.out.println(isA("abcmhsw"));

    }
}
    

