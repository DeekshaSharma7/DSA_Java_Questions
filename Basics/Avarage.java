public class Avarage {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double) arr[i];
        }
        System.out.println("The Sum of the Elements is: " +sum);
        double Avg = sum / n;
        System.out.println("The Average of an Element is: " +Avg);
    }   
}
