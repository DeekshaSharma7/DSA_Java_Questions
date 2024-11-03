import java.util.*;

public class SmallestElement1 {
    public static int sort(int arr[]) {
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main(String[] args) {
        int arr1[] = { 5, 9, 7, 3, 8 };
        System.out.println("The smallest Element is: " +sort(arr1));
    }
}

// -----------------------------------------------------------------------------------
//     OUTPUT:
//     The smallest Element is: 3
