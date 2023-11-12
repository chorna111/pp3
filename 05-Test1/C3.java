import java.util.ArrayList;
import java.util.Collections;

public class C3 {


    public static boolean isAlphabet(String t){
        ArrayList<String> arr=new ArrayList<String>();
        char[] arr2=t.toCharArray();
        String s="";
        for(char a:arr2){
            s+=a;
            arr.add(s);
            s="";

            

        }
        Collections.sort(arr);
        String p="";
        for(String letter:arr){
            p+=letter;

        }
        if(p.equals(t)){
            return true;
        }else{
            return false;
        }

    }


    public static String hideText(String t){
        if(t.length()==2){
            return t;
        }else{
            String first=t.substring(0,1);
            String last=t.substring(t.length()-1);
            int len=(t.substring(1, t.length()-1)).length();
        
            String replaced="*".repeat(len);
            return first+replaced+last;
        }
        
        
    



    }
   
    
    
   
    
}

