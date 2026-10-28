

def reverseArray(usersArray):


    pointer = len(usersArray)

    new_array = [ usersArray[index] for index in range(pointer-1, -1, -1) ]


    return new_array;




 

numbers = [ [1, 2, 3], [4, 5, 6], [7, 8, 9]]
                                


for number in numbers:

    print(reverseArray(number))
    print(" ")

        

