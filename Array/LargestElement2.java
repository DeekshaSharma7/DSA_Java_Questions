RECURSIVE APPROACH (Using a max variable):--

    
public class LargestElement2 {
    public static void main(String[] args) {
        int arr1[] = { 4, 8, 3, 7, 9, 2 };
        System.out.println("The Largest Number is: " +largest_number(arr1));
    }

    public static int largest_number(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

--------------------------------------------------------------------------------------------------

    OUTPUT:
    The Largest Number is: 9
