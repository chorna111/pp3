import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    StudentGrades(String name, int numberOfGrades) {
        this.studentName = name;
        this.grades = new double[numberOfGrades];
        Random generator = new Random();
        for (int i = 0; i < numberOfGrades; i++) {
            double n = (int) (generator.nextDouble(0, 1) * 10) * 0.5 + 1;
            grades[i] = n;

        }
    }

    StudentGrades(String name) {

        this.studentName = name;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of grades: ");

        int numberOfGrades = s.nextInt();
        this.grades = new double[numberOfGrades];
        System.out.println("Enter " + numberOfGrades + " grades for " + studentName);

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.println("Enter grade " + (i + 1));

            this.grades[i] = s.nextDouble();
        }
    }

    public double calculateLowest() {
        double lowest = grades[0];
        for (double i : grades) {
            if (i < lowest) {
                lowest = i;
            }
        }
        return lowest;
    }

    public double calculateHighest() {
        double highest = grades[0];
        for (double i : grades) {
            if (i > highest) {
                highest = i;

            }
        }
        return highest;
    }

    public int numberOfGrades() {

        return grades.length;
    }

    public double average() {
        double sum = 0;
        for (double i : grades) {
            sum += i;
        }
        return sum / numberOfGrades();
    }

    public void display() {
        System.out.println("Student name: " + studentName);
        System.out.print("Grades: ");
        // String s="";
        // for(double grade:grades){
        // s+=grade+",";
        // }
        // System.out.println(s.substring(0,s.length()-1));
        ArrayList<String> list = new ArrayList<String>();
        for (double grade : grades) {
            list.add(String.valueOf(grade));

        }
        String joined = String.join(",", list);
        System.out.println(joined);

        System.out.println("Number of grades: " + numberOfGrades() + "\nLowest grade: " + calculateLowest()
                + "\nHighest grade: " + calculateHighest() + "\nGrade point average: " + average());
    }

    public static void main(String[] args) {
        double[] amandaGrades = { 3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5 };
        double[] jamesGrades = { 2.0, 3.0, 2.0, 4.5, 4.5 };
        StudentGrades student1 = new StudentGrades("Amanda", amandaGrades);
        student1.display();
        StudentGrades student2 = new StudentGrades("James", jamesGrades);
        student2.display();
        StudentGrades student3 = new StudentGrades("Nastia", 7);
        student3.display();
        StudentGrades student4 = new StudentGrades("Alina");
        student4.display();
    }

}
