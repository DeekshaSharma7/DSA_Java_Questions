public class Positive_Negative_Number {
    public static void main(String[] args) {
        int n = -15;
        solve(n);
    }

    public static void solve(int n) {
        if (n > 0) {
            System.out.println("The number " +n+ " is Positive");
        } else {
            System.out.println("The Number " +n+ " is Negative");
        }
    }
}

------------------------------------------------------------------------------

    OUTPUT:
    The Number -15 is Negative.
