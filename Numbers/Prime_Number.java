import java.util.*;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n+ " is a Prime Number.");
        } else {
            System.out.println(n+ " is not a Prime Number.");
        }
    }

    public static boolean isPrime(int n){
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
}

---------------------------------------------------------------------------------------

    OUTPUT:
    Enter the Number: 
    13
    13 is a Prime Number.
    

    Enter the Number: 
    24
    24 is not a Prime Number.
