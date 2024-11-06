// import java.util.*;

// public class smallestNumber {
//     public static int getsmallest(int num[]){
//         int smallest = Integer.MAX_VALUE;

//         for(int i=0; i<num.length; i++){
//             if(smallest > num[i]){
//                 smallest = num[i];
//             }
//         }
//         return smallest;
//     }
//     public static void main(String[] args) {
//         int num[] ={1,2,6,3,5};
//         System.out.println("smallest value: " +getsmallest(num));
//     }
// }

//TC => O(n)

public class smallestNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,8,3,4,7,10};
        int smallest = arr[0];
        for(int i=0; i<arr.length; i++){
            smallest = Math.min(smallest, arr[0]);
        }
        System.out.println("smallest value is: " +smallest);
    }
}
