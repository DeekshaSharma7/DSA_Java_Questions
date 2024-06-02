public class Positive_Negative_Number_Bitwise {
    public static void main(String[] args) {
        int n = -8;
        solve(n);
    }

    public static void solve(int n) {
        if (n >> 31 == 0) {
            System.out.println(n+ " is Positive");
        } else if (n >> 31 == -1) {
            System.out.println(n+ " is Negative");
        }
    }
}
