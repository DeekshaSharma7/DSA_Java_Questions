public class Even_Odd {
    public static void main(String[] args) {
        int n = 5;
        if (remainder(n) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static int remainder(int n) {
        return (n % 2);
    }
}

// -------------------------------------------------------------------

//     OUTPUT:
//     Odd number
