/*
Write a program to count (and print) the number of duplicate values in an array. You 
can store the fixed (hard-coded) values in the array. Then print those array values. 
Finally, count and print the number of duplicate values.
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
           