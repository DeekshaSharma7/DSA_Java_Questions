public class Even_Odd_Bitwise {
    public static void main(String[] args) {
        int n = 6;
        if (solve(n) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
    
    public static int solve(int n) {
        if ((n & 1) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}

--------------------------------------------------------------------------

    OUTPUT:
    Even Number
