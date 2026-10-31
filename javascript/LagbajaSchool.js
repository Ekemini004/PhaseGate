
const prompt = require("prompt-sync")();

let StudentScore = 0;

console.log("Hi teacher, how many students do you have? ");

let NumberOfStudents = Number(prompt(""));

console.log("how many subjects do they offer");

let NumberOfSubjects = Number(prompt(""));

console.log("Saving >>>>>>>>>>>>>>>>>");

console.log("Saved successfully!");

//create an array list for this teachers class
let classOne = [];


//if teacher entered thet they have 5 srudents, add new array list 5 times into the array.

createXNumberofArrays(NumberOfStudents, classOne);


//show that you have created Xnumber of array lists in the class
//console.log(classOne);


//ask teacher for Student Score per subject
for (let count = 0; count < classOne.length; count++) {

    console.log(`Entering score for Student ${count + 1}\n \n`);

    for (let index = 0; index <= NumberOfSubjects - 1; index++) {

        console.log(`Enter score for subject ${index + 1}: `);

        console.log();

        classOne[count].push(Number(prompt("")));

        console.log("Saving >>>>>>>>>>>>>>>>>");

        console.log();

        console.log("Saved successfully!");

    }

}


console.log(classOne);

printTableOfStudentScoresAndSubjects(classOne);


function createXNumberofArrays(numberOfArrays, userArrayList) {

    for (let index = 1; index <= numberOfArrays; index++) {

        userArrayList.push([]);

    }

}


function printTableOfStudentScoresAndSubjects(userArray) {

    console.log("==========================================================================");

    /*          for(int countOne = 0; countOne < userArrayList.size(); countOne++){

                for(int indexOne = 0; indexOne < userArrayList.get(countOne).size(); indexOne++){


                    System.out.printf("\t\tSUB%d",index+1);


                }

            }*/


    console.log("STUDENT\t\tSUB1\tSUB2\tTOT\tAVG\tPOS");

    console.log("==========================================================================");

    //console.log();
    let total = 0;

    for (let count = 0; count < userArray.length; count++) {

        let row = `Student ${count + 1}`;

        for (let index = 0; index < userArray[count].length; index++) {

            total += userArray[count][index];
            row += `\t${userArray[count][index]}`;


        }
        row += `\t${total}`;
        row += `\t${Math.floor(total / userArray[count].length)}`;
        console.log(row);

        total = 0;

    }


    console.log("==========================================================================");


    console.log("==========================================================================");

}
