// import java.util.*;

// public class Increasing_Decreasing {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 7, 5, 6, 4 };
//         int n = arr.length;
//         Arrays.sort(arr);
//         for (int i = 0; i < n / 2; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         for (int i = n - 1; i >= n / 2; i--) {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


// // ----------------------------------------------------------------------

// //     OUTPUT:
// //     1 2 4 7 6 5 




import java.util.*;

public class Increasing_Decreasing {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 5, 6, 4 };
        int n = arr.length;
        
        // Custom sorting function
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = n - 1; i >= n / 2; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
