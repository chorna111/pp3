import java.util.ArrayList;

public class Cities {
    public String[] cityNames;
    public Cities(String[] cityNames){
        this.cityNames=cityNames;
    }
    public Cities filter(char c){
        ArrayList<String> list=new ArrayList<String>();
        
        for(String city:cityNames){
            if(city.charAt(0)==c){
                list.add(city);
            }
        }
        String[] out=new String[list.size()];
        int index=0;
        for(String city:list){
            out[index]=city;
            index++;
        }
        Cities output=new Cities(out);
        return output;
    } 
    public String cities(){
        String string="";
        for(String city:cityNames){
            string+=city;
        }
        return string;
    }
    
    public static void main(String[] args) {
        String[] arr={"Warszawa","Sopot","Kielce","Szczecin","Sumy"};
        Cities c=new Cities(arr);
        System.out.println(c.filter('S').cities());
    }
    
}
