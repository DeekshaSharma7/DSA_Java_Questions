import java.util.*;

public class LargestElement1 {
    public static void main(String args[]) {
        int arr1[] = { 7, 4, 8, 3, 1, 2 };
        System.out.println("The Largest Element is: "+Largest_Element(arr1));
    }

    public static int Largest_Element(int arr[]) {
        
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
