public class largest_num {
    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<=num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int num[] = {1,3,8,6,7};
        System.out.println("Largest number : " +getLargest(num));
    }
}
