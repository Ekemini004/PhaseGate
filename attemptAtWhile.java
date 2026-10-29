        while(running = true){
        System.out.println("Hi there! Welcome to catalyst parking lot. enter a number from 1-20 to park your damn car!");

    int userParkingSlotSelection = input.nextInt();

        for(int count = 0; count<= parkingSpace.length-1; count++){



              for(int index = 0; index <= parkingSpace[count].length-1; index++){

                    parkingSpace[count][index] = park;

                    break;

              }

                    break;

        }


     displayParkingLot(parkingSpace);
        System.out.println("do you want to reserve another parking slot ?");
        int reserveAgain = input.nextInt();

        if(reserveAgain == 0) running = false;

    } 


