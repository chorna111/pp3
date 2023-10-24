public class Ttwo {
    public static void main(String[] args) {
        int speed=158;
        boolean speedIsValid=(speed>=40&&speed<=140);
        String valid=String.valueOf(speedIsValid).substring(0,1).toUpperCase()+String.valueOf(speedIsValid).substring(1);
        System.out.println("Vehicle speed: "+speed+"\nSpeed is valid: "+valid);
        }

    }
    
    

