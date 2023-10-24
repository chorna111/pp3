public class Person {
    String name;
        double weight; // in kilograms
        double height; // in centimeters
    
        // Constructor with only name
        public Person(String name) {
            this.name = name;
        }
    
        // Constructor with name, weight, and height
        public Person(String name, double weight, double height) {
            this.name = name;
            this.weight = weight;
            this.height = height;
        }
    
        // Method to set weight and height
        public void setWeightAndHeight(double weight, double height) {
            this.weight = weight;
            this.height = height;
        }
        public double calculateBMI(){
            double heightiInM=height/100;
            double output=weight/Math.pow(heightiInM,2);
            return output;


        }
    
        // Method to display the person's record
        public void displayRecord() {
            if(calculateBMI()<18.5){
                System.out.println("Name: " + name+"\nWeight: "+weight+"kg\nHeight: "+height+"cm\nBMI too low");

            }else if(calculateBMI()>24.9){
                System.out.println("Name: " + name+"\nWeight: "+weight+"kg\nHeight: "+height+"cm\nBMI too high");

            }else{
                System.out.println("Name: " + name+"\nWeight: "+weight+"kg\nHeight: "+height+"cm\nBMI is fine: "+calculateBMI());

            }
           
        }
        public static void main(String[] args) {
            Person person1=new Person("Nastia");
            person1.setWeightAndHeight(54, 165);
            person1.calculateBMI();
            person1.displayRecord();
            Person person2=new Person("Ilona");
            person2.setWeightAndHeight(60, 165);
            person2.calculateBMI();
            person2.displayRecord();
            Person person3=new Person("Michael");
            person3.setWeightAndHeight(200, 190);
            person3.calculateBMI();
            person3.displayRecord();



}
}