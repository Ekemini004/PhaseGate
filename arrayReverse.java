import java.util.Arrays;
public class arrayReverse{


    public static void main(String [] args){


        int [][] numbers = {  {1, 2, 3},

                              {4, 5, 6},

                              {7, 8, 9},
                                
                              };  
                                

                                 

        //int [][] array = reverseArray(numbers);

        

        for(int index = 0; index <= numbers.length-1; index++){

                   //for(int indexTwo = 0; indexTwo < array.length-1; indexTwo++){

                        System.out.printf("%s", Arrays.toString(reverseArray(numbers[index])));

               // }

            

        }

        









    }


    public static int [] reverseArray(int [] userArray){

    int []temp = new int [userArray.length];

    int pointer = userArray.length-1;

    for(int index = 0; index <= userArray.length-1; index++){


        //for(int indexTwo = 0; indexTwo <= userArray[index].length-1 ; indexTwo++){


            //picking from the back n putting in new array. aka reverse.
            
            temp[index] = userArray[pointer];
             pointer--;





            //}

            

        }

       
        return temp;
        
    }









}
