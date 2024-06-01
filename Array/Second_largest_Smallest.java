public class Second_largest_Smallest {
    public static void main(String[] args) {
        int arr[] = { 8, 6, 7, 1, 3, 9, 5 };
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("The Second Smallest element is: " +arr[1]);
        System.out.println("The Second Largest element is: " +arr[arr.length-2]);
        
    }
}
