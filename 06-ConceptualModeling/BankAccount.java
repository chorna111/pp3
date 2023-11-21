
public class BankAccount {
    private String clientId;
    private int balance;
    private String accountHolder;
    public BankAccount(String clientId, int balance, String accountHolder) {
        this.clientId = clientId;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }
    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }


    public String deposit(int amount){
        balance+=amount;
        return "Operacja wykonana";
    }
    public String withdraw(int amount){
        if(amount>500){
            return "You have crossed the limit of possible withdraw!";
        }else{
            if(balance>=amount){
                balance-=amount;
                return "Operacja wykonana";
            }else{
                return "No withdraw is possible";
            }}
    
    }
    public String displayBalance(){
        return "Your balance is "+balance;
    }
    public static void main(String[] args) {
        BankAccount ac=new BankAccount("226582", 1000,"Jan Nowak");

        System.out.println(ac.displayBalance());
        System.out.println(ac.deposit(500));
        System.out.println(ac.displayBalance());
        System.out.println(ac.deposit(200));
        System.out.println(ac.displayBalance());
        System.out.println(ac.withdraw(300));
        System.out.println(ac.displayBalance());
        System.out.println(ac.withdraw(501));
        System.out.println(ac.displayBalance());
    


    }

    

    
    
    
}
