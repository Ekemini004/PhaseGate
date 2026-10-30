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

    //create an array list for each student, where each score for them will enter.
    // if teacher entered thet they have 5 srudents, create 5 array lists. each score will enter there.
    
    for(int index = 1; index <= NumberOfStudents; index++ ){

      

        ArrayList <Integer> values = new ArrayList <Integer>();
         values.add(6);


    }

    //i dont really know how to work with mutli / nested arralists if not theyd have been in one
    //show that you have created Xnumber of array lists
     
    

    ArrayList <Integer> values = new ArrayList <Integer>();

    
    values.add(5);
    
    System.out.println(values);
    
    

 }


   /*public static ArrayList createXNumberofArrayLists(int numberOfArrayLists){
     
       ArrayList <Integer> Student = new ArrayList <Integer> ();

        return Student;

    }
*/










}
