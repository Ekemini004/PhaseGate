import java.util.Scanner;
import java.util.ArrayList;

public class LagbajaStudentGrade{


    public static void main(String [] args){
    
    int StudentScore = 0;

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

       createXNumberofArrayLists(NumberOfStudents, classOne); 
  
       
    //show that you have created Xnumber of array lists in the class
        System.out.println(classOne);

    //ask teacher for Student Score per subject
    System.out.println("Entering score for student 1 ");

    //ask teacher for Student Score per subject
    
    
    for(int count = 0; count < classOne.size(); count++){

        for(int index = 0; index < classOne.size(); index++){

                if(count == 0){

                    System.out.printf("Enter score for subject %d: ",count+1);
                    classOne.get(count).add(input.nextInt());

                }


           }

    }
    

        System.out.println(classOne);








 }


   public static void createXNumberofArrayLists(int numberOfArrayLists, ArrayList <ArrayList <Integer>> userArrayList){
     
        for(int index = 1; index <= numberOfArrayLists; index++){

            userArrayList.add(new ArrayList<>());

        }

    }











}
