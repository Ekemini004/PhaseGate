def createXNumberofArrayLists(numberOfArrayLists, userArrayList):

    for index in range(1, numberOfArrayLists + 1):

        userArrayList.append([])


def printTableOfStudentScoresAndSubjects(userArrayList):

    print("==========================================================================")



    print("STUDENT\t\tSUB1\tSUB2\tTOT\tAVG\tPOS")

    print("==========================================================================")

    # print()
    total = 0

    for count in range(0, len(userArrayList)):

        print(f"Student {count + 1}", end="")

        for index in range(0, len(userArrayList[count])):

            total += userArrayList[count][index]

            print(f"\t{userArrayList[count][index]}", end="")

        print(f"\t{total}", end="")

        print(f"\t{total // len(userArrayList[count])}", end="")

        print()

        total = 0


    print("==========================================================================")

    print("==========================================================================")




StudentScore = 0


NumberOfStudents = int(input("Hi teacher, how many students do you have?"))


NumberOfSubjects = int(input("how many subjects do they offer"))

print("Saving >>>>>>>>>>>>>>>>>")

print("Saved successfully!")

# create a parent list for this teachers class
classOne = []


# if teacher entered that they have 5 students, add new list 5 times into the array.

createXNumberofLists(NumberOfStudents, classOne)


# show that you have created Xnumber of array lists in the class
# print(classOne)


# ask teacher for Student Score per subject
for count in range(0, len(classOne)):

    print(f"Entering score for Student {count + 1}\n\n\n")

    for index in range(0, NumberOfSubjects):

        print(f"Enter score for subject {index + 1}:\n")

        print()

        classOne[count].append(int(input()))

        print("Saving >>>>>>>>>>>>>>>>>")

        print()

        print("Saved successfully!")


print(classOne)

printTableOfStudentScoresAndSubjects(classOne)
