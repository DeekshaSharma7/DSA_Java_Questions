
public class Duplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 4, 4, 5, 7 };
        int k = removeDuplicate(arr);
        System.out.println("The Array after removing duplicate Elements: "+k);
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i] +" ");
        }
    }

    public static int removeDuplicate(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}

----------------------------------------------------------------------------------------------------------

    OUTPUT:
    The Array after removing duplicate Elements: 6
    1 
    2 
    3 
    4 
    5 
    7 
