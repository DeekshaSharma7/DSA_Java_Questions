import java.util.*;
public class reverse {
    public static void reverse(int arr[]){
        int first = 0;
        int last = arr.length-1;

        while(first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        reverse(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// TC => O(n)
// SC => constant (1)
