public class DrivingLicenceTest {
    public static void main(String[] args) {
        
        DrivingLicence d1=new DrivingLicence();
        d1.setName("petER");
        d1.setSurname("Parker");
        d1.setAddress("Rakowicka street");
        d1.setCity("Cracow");
        d1.setPostalCode("30-218");
        d1.setNumber(12345);
        d1.setYear(2003);

        d1.display();
        System.out.println(d1);
    }
    
}
