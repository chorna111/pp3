public class Student {
    String name;
    int age;
    int studentId;
    boolean isIdValid;
    int semesterNumber;
    int averageGrade;
    void sayHello(){
        System.out.println("Hello from  "+name);

    }
    void displayName(){
        System.out.println(name);
    }
    void displayAge(){
        System.out.println(age);
    }
    void displayInfo(){
        System.out.println("Name:"+ name);
        System.out.println("Semester number:"+ semesterNumber);
        System.out.println("Average grade:"+ averageGrade);
    }
    void changeStatus(){
        isIdValid=!isIdValid;
    }
    void displayInfo2(){
        System.out.println("Name:"+ name);
        System.out.println("Id:"+ studentId);
        String valid=(isIdValid) ? "valid" : "invalid";
        System.out.println("Id is "+valid);
        
    }



    
}
