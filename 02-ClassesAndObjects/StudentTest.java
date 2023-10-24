public class StudentTest {    
    public static void main(String[] args) {
        
        // object creation
        Student s = new Student();
        
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        Student student1=new Student();
        student1.name= "Nastia";
        student1.age=19;
        student1.sayHello();
        student1.displayName();
        student1.displayAge();
        Student student2=new Student();
        student2.name= "Klaudia";
        student2.age=23;
        student2.sayHello();
        student2.displayName();
        student2.displayAge();
        student2.studentId=226582;
        student2.isIdValid=false;
        student2.displayInfo2();

    }
}
