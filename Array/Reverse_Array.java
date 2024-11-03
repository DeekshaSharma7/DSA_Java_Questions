public class Reverse_Array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        System.out.println("The Original Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        reverse(arr);

        System.out.println();
        System.out.println("The Reverse Array is: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }

    public static void reverse(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}


// ---------------------------------------------------------------------------------------------------------------------

//     OUTPUT:

//     The Original Array is: 
//     1 2 3 4 5 6 7 8 
//     The Reverse Array is:
//     8 7 6 5 4 3 2 1

