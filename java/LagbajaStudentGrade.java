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
        //System.out.println(classOne);

    //ask teacher for Student Score per subject
    

    //ask teacher for Student Score per subject
    for(int count = 0; count < classOne.size(); count++){

         System.out.printf("Entering score for Student %d%n %n%n", count+1);   

        for(int index = 0; index <= NumberOfSubjects-1; index++){

              System.out.printf("Enter score for subject %d: %n", index+1);
              
              System.out.println(); 

              classOne.get(count).add(input.nextInt());
              
              System.out.println("Saving >>>>>>>>>>>>>>>>>");

              System.out.println();  
    
              System.out.println("Saved successfully!");

            

           }


 }
    

        System.out.println(classOne);

        printTableOfStudentScoresAndSubjects(classOne);
        
        

    














 }


   public static void createXNumberofArrayLists(int numberOfArrayLists, ArrayList <ArrayList <Integer>> userArrayList){
     
        for(int index = 1; index <= numberOfArrayLists; index++){

            userArrayList.add(new ArrayList<>());

        }

    }



    public static void printTableOfStudentScoresAndSubjects(ArrayList <ArrayList <Integer>> userArrayList){

        System.out.println("==========================================================================");

        System.out.println("STUDENT\t\tSUB1\tSUB2\tSUB3\tTOT\tAVG\t\tPOS");

        System.out.println("==========================================================================");

        //System.out.println();

        for(int count = 0; count < userArrayList.size(); count++){

            System.out.printf("Student %d",count+1);

            for(int index = 0; index < userArrayList.get(count).size(); index++){

      
                System.out.printf("\t%d",userArrayList.get(count).get(index));

                //;
                


            }
    
                System.out.println();

        }



        System.out.println("==========================================================================");
        

        System.out.println("==========================================================================");



    }









}
