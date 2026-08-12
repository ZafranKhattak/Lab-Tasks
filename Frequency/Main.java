package Frequency;

class Testing {
     int frequency(int arr[], int target) 
     {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
            {
                count++;               
            }
        }
        return count;
    }
}

class Main {
    public static void main(String[] args) {

        Testing test = new Testing();

        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;

        System.out.println("Frequency is: " + test.frequency(arr, target));
    }
}