package mock;
import java.util.ArrayList;

public class Cities {
    public String[] list;
    
    public Cities(String[] list){
        this.list=list;
       
    }
    
    
    public Cities filter(char a){
        ArrayList<String> filtered=new ArrayList<String>();



    
        int size=0;
        for(String city:list){
            
            if(city.startsWith(String.valueOf(a))){
                filtered.add(city);
                size++;


            }
        }
      
        

        Cities output=new Cities(filtered.toArray(new String[size]));
        return output;

    }
    public String cities(){
        String s="";
        for(String city:list){
            s+=city;
        }
        return s.trim();
    }

    public static void main(String[] args) {
        String[] cityArray = {"Warszawa", "Sopot", "Kielce", "Szczecin"};
        Cities c = new Cities(cityArray);
        
        System.out.println(c.filter('S').cities());

        
    }
    
}
