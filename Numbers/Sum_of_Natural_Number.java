public class Sum_of_Natural_Number {
    public static void main(String[] args) {
        solve(5);
        solve(6);
    }

    public static void solve(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of the Natural Number is: "+sum);
    }
}

// ----------------------------------------------------------------------------------------------

//     OUTPUT:

// The sum of the Natural Number is: 15
// The sum of the Natural Number is: 21
