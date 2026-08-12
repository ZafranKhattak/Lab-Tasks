package TwoDarrayvertically;

public class Main {
    
    public static void main(String[] args) {
        
        int array[][] = {
            {1,2,3} ,
            {4,5,6} , 
            {7,8,9} , 
        };


        for (int i=0; i<array.length; i++)
        {
                for (int j=0; j<array.length; j++)
                {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
        }

        System.out.println("After Flip Vertically:");

        for (int k=0; k<array.length; k++)
        {
            for (int l=0; l<array.length; l++)
            {
                System.out.print(array[l][k] + " ");
            }

            System.out.println();
        }
    }
}
