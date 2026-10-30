import java.util.Scanner;
import java.util.ArrayList;

public class LagbajaStudentGrade{


    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Hi teacher, how many students do you have? ");

    int NumberOfStudents = input.nextInt();

    System.out.println("how many subjects do they offer");

    int NumberOfSubjects = input.nextInt();

    System.out.println("Saving >>>>>>>>>>>>>>>>>");
    
    System.out.println("Saved successfully!");

    //create an array list for this teachers class
    ArrayList <ArrayList <Integer>> classOne = new ArrayList <> ();


    // if teacher entered thet they have 5 srudents, add new array list 5 times into the array.

        for(int index = 1; index <= NumberOfStudents; index++){

            classOne.add(new ArrayList<>());

        }

    
    
    //i dont really know how to work with mutli / nested arralists if not theyd have been in one
    //show that you have created Xnumber of array lists
     
    
        
        System.out.println(classOne);





 }


   /*public static ArrayList createXNumberofArrayLists(int numberOfArrayLists){
     
       ArrayList <Integer> Student = new ArrayList <Integer> ();

        return Student;

    }
*/










}
