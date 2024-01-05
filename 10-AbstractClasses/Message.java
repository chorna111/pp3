public abstract class Message {
    private String mes;
    public Message(){

    }
    public Message(String mes){
        this.mes=mes;

    }
    public String getMes() {
        return mes;
    }
    public  int charNumber(){
        char[] arr=mes.toCharArray();
      ;
        return arr.length;
    }
    public abstract String send();
    


    
}
