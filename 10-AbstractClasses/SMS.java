public class SMS extends Message {
    private String phoneNumber;
    public SMS(String mes,User user){
        super(mes);
        phoneNumber=user.getPhoneNumber();
        
    }
    
    
    
    public String send(){
        return String.format("a message '%s' sended to a number %d",getMes(),phoneNumber);
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(User user){
        phoneNumber=user.getPhoneNumber();
    }
    
    


    
}
