public class DrivingLicence {
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private int number;
    private int year;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;

    }
    
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if(year>=1980){
            this.year = year;
        }else{
            System.out.println("Invalid year");
        }
    }

    
    public String toString() {
        return "Name: "+getName()+"\nSurname: "+getSurname()+"\nAddress: "+getAddress()+"\nPostal code: "+getPostalCode()+"\nCity: "+getCity()+"\nDriving license number: "+getNumber()+"\nYear of issue: "+getYear();
    }
    public void display(){
        System.out.println("Name: "+getName()+"\nSurname: "+getSurname()+"\nAddress: "+getAddress()+"\nPostal code: "+getPostalCode()+"\nCity: "+getCity()+"\nDriving license number: "+getNumber()+"\nYear of issue: "+getYear());
    }

}

