public class Reverse {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("The Reverse Number is: " +solve(n));
    }

    public static int solve(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }
}

------------------------------------------------------------------------------------

    OUTPUT:

    The Reverse Number is: 54321
