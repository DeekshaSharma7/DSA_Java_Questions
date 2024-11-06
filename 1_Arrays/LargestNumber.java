// import java.util.*;

// public class LargestNumber {

//     public static int getlargest(int num[]){
//         int largest = Integer.MIN_VALUE; // initialize

//         for(int i=0; i<num.length; i++){
//             if(largest<num[i]){
//                 largest = num[i];
//             }
//         }
//         return largest;

//     }

//     public static void main(String[] args) {
//         int num[] ={1,2,6,3,5};
//         System.out.println("Largest value is: " +getlargest(num));
//     }
// }

// - infinity = Integer.MIN_VALUE
// + infinity = Integer.MAX_VALUE

//TC => O(n)

public class LargestNumber {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 8, 3, 2, 5};
        int largest = arr[0];
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        System.out.println("Largest number is : " + largest);
    }
}