public class SmallestElement2 {
    public static void main(String[] args) {
        int arr1[] = { 5, 7, 3, 8, 9 };
        System.out.println("The Smallest Element is: " +Smallest_Element(arr1));
    }

    public static int Smallest_Element(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

------------------------------------------------------------------------------------------------

    OUTPUT:

    The Smallest Element is: 3
