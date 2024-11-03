public class Prime_InRange1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 15;
        Prime_in_given_Range(a, b);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void Prime_in_given_Range(int a, int b) {
        for (int i = a; i <= b; i++) {
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
}

// -------------------------------------------------------------------------------------

//     OUTPUT:
//     2 
//     3 
//     5 
//     7 
//     11 
//     13
