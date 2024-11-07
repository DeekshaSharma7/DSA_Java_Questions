public class pairsInArray {
    public static void printPairs(int arr[]){
        int tp = 0;
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + curr + "," + arr[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs is : " +tp);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printPairs(arr);
    }
}


//Total pairs = n(n-1)/2 
// TC => O(n^2) => nested loop => n+(n-1)+(n-2)+(n-3)............2+1.