public class RemoveDuplicate_Sorted {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3, 3, 4, 4 };
        int k = removeDupl(arr);
        System.out.println("The array after removing: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] +" ");
        }
    }

    public static int removeDupl(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}


// -------------------------------------------------------------------

//     OUTPUT:
//     The array after removing: 
//     1 2 3 4 
    
