public class Cities {
    public String[] cityNames;
    public Cities(String[] cityNames){
        this.cityNames=cityNames;
    }
    public String filter(char letter){
        String l=String.valueOf(letter);
        String output="";
        for(String city:cityNames){
            if(city.startsWith(l)){
                output+=city;

            }
        }
        return output;
    }
    public static void main(String[] args) {
        String[] arr={"Warszawa","Sopot","Kielce","Szczecin","Sumy"};
        Cities c=new Cities(arr);
        System.out.println(c.filter('S'));
    }
    
}
