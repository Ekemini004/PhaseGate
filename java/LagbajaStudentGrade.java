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
    
    for(int index = 1; index <= NumberOfStudents; index ++ ){

        createXNumberofArrayLists(index);

    }

    

    

    
    

    }


   public static ArrayList createXNumberofArrayLists(int numberOfArrayLists){

       ArrayList <Integer> """numberOfArrayLists""" = new ArrayList <Integer> ();

        return ArrayList;

    }











}
