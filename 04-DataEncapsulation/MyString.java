public class MyString {
    
    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    public int calculateNumber(String s){
            
        return s.length();
    }
    public String display9(){
        return getS().substring(0,9);

    }
    public boolean checkEnd(){
        if(getS().endsWith("day!")){
            return true;
        }else{
            return false;
        }
            
    }
    public boolean checkIfEmpty(){
        if(!getS().equals("")){
            return true;
        }else{
            return false;
        }
            
    }
    public int lastE(){
        int index=getS().lastIndexOf("e");
        return index;
    }
    public String replace(){
        return getS().replace(" ", "-");

    }
    public String toUpper(){
        return getS().toUpperCase();
    }

    public static void main(String[] args) {
        
        MyString s1=new MyString();
        s1.setS("Have a nice day!");
        System.out.println(s1.getS());
        System.out.println(s1.display9());
        System.out.println(s1.checkEnd());
        System.out.println(s1.checkIfEmpty());;
        System.out.println(s1.lastE());
        System.out.println(s1.replace());
        System.out.println(s1.toUpper());
        MyString s2=new MyString();
        s2.setS("Hello,world!");
        System.out.println(s2.checkEnd());
        System.out.println(s2.toUpper());


        
    }
}


