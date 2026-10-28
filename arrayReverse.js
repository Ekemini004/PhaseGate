


        let numbers = [       [1, 2, 3],

                              [4, 5, 6],

                              [7, 8, 9],
                                
                              ];  
                                


    for(let index = 0; index < numbers.length; index++){

            console.log(reverseArray(numbers[index]));            
            console.log("\n");


        }








function reverseArray(usersArray){

let new_array = new Array(usersArray.length);
let pointer = usersArray.length - 1;

for(let index = 0; index <= usersArray.length-1; index++ ){

        new_array [index] = usersArray[pointer];
        pointer--;


    }


    return new_array;
}



 
