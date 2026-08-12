/*
Write a program to copy the elements of one array into another array but in reverse 
order. For example, if the first array contains the values 1, 2, 3, 4, 5 then the second 
array should contain the values (after copying from the first array) 5, 4, 3, 2, 1. 
Note: Take the size of the first array as input from the user, then get those much 
values from the user, store them in the first array, and print the first array’s values. 
Then copy the values from the first array, store them in reverse order in the second 
array, and print the second array’s values.
 */



public class Main {
    public static void main(String args[])
    {
    
        int duplicateCount = 0;

        int array [] = {21, 9, 17, 43, 9, 15, 21, 6, 38, 6};

        for (int i=0; i<array.length-1; i++)
        {
           for (int j= i+1; j<array.length; j++)
            {
                if(array[i] - array[j] ==0)
                {
                    duplicateCount++;
                }
            }
        }

        System.out.println("Total duplicate is " + duplicateCount); 
    }    
}
           