import java.util.Scanner;

public class MiniParkingSystem{

    public static void main(String [] args){


    Scanner input = new Scanner(System.in);
    int park = 1;
    

        int [] parkingSpace = new int [20];
        
        

        //displayParkingLot(parkingSpace);

        

boolean running = true;
while(running){
        //ask user for number

        displayParkingLot(parkingSpace);
        System.out.println("Hi there! Welcome to catalyst parking lot. enter a number from 1-20 to park your damn car!");

    int userParkingSlotSelection = input.nextInt();

            switch(userParkingSlotSelection){

            case 1 -> { parkingSpace[0] = 1;
                    displayParkingLot(parkingSpace);     
            }

            case 2 -> { parkingSpace[1] = 1;
                    displayParkingLot(parkingSpace);
            }

            case 3 -> { parkingSpace[2] = 1;
                     displayParkingLot(parkingSpace); 
            }

            case 4 -> { parkingSpace[3] = 1;
                    displayParkingLot(parkingSpace); 
            }

            case 5 -> { parkingSpace[4] = 1;
                      displayParkingLot(parkingSpace); 
            }

            case 6 -> { parkingSpace[5] = 1;
                        displayParkingLot(parkingSpace); 
            }

            case 7 -> { parkingSpace[6] = 1;
                      displayParkingLot(parkingSpace); 
            }

            case 8 -> { parkingSpace[7] = 1;
                    displayParkingLot(parkingSpace); 
            }

            case 9 -> { parkingSpace[8] = 1;
                        displayParkingLot(parkingSpace); 
            }

            case 10 -> { parkingSpace[9] = 1;
                     displayParkingLot(parkingSpace); 
            }

            case 11 -> { parkingSpace[10] = 1;
                    displayParkingLot(parkingSpace); 
            }

            case 12 -> { parkingSpace[11] = 1;
                    displayParkingLot(parkingSpace); 
            }

            case 13 -> { parkingSpace[12] = 1;
                    displayParkingLot(parkingSpace); 
            }

            case 14 -> { parkingSpace[13] = 1;
                    displayParkingLot(parkingSpace); 
            }

            case 15 -> { parkingSpace[14] = 1;

            }

            case 16 -> { parkingSpace[15] = 1;
                    displayParkingLot(parkingSpace); 
            }

            case 17 -> { parkingSpace[16] = 1;
                    displayParkingLot(parkingSpace); 
            }

            case 18 -> { parkingSpace[17] = 1;
                    displayParkingLot(parkingSpace); 
            }

             case 19 -> { parkingSpace[18] = 1;
                    displayParkingLot(parkingSpace);            
            }

            case 20 -> { parkingSpace[19] = 1;
                       displayParkingLot(parkingSpace); 
            }


            case 21 -> { parkingSpace[20] = 1;
                       displayParkingLot(parkingSpace); 
            }



             default-> System.out.println("invalid number. Select a number from 1-20");

        }


        System.out.print("do you want to reserve another slot? type yes or no: ");

        String reserveChoice = input.next();

        if(reserveChoice.equals("no"))running = false;
        

     }





}
        











    public static void displayParkingLot(int []userArray){

                int index = 0;

                for(int count = 0; count<= userArray.length-1; count++){


                        System.out.printf(" %d ", userArray[count]);
                        count++;

                    if(count > 4)System.out.printf(" %d ", userArray[count]);

        


                System.out.println();

            }

    }







}
