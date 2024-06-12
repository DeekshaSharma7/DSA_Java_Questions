import java.util.*;

public class Increasing_Decreasing {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 5, 6, 4 };
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = n - 1; i >= n / 2; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}


----------------------------------------------------------------------

    OUTPUT:
    1 2 4 7 6 5 
