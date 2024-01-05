public class Email extends Message {
    private String subject;
    private String recepientAdress;
    public Email(String subject,String recepientAdress,String mes){
        super(mes);
        this.subject=subject;
        this.recepientAdress=recepientAdress;
        

    }
    public String send(){
        return String.format("Email subject: %s\nEmail recipient: \nEmail content: %s",subject,recepientAdress,getMes());
    }

    
}
