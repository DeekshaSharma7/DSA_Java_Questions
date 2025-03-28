public class Palindrome {
    public static boolean palindrome_Number(int n) {
        int rev_num = 0;
        int org_num = n;

        while (n > 0) {
            int rem = n % 10;
            rev_num = rev_num * 10 + rem;
            n = n / 10;
        }
        if (rev_num == org_num) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        int n = 14541;
        if (palindrome_Number(n)) {
            System.out.println(n+" => Palindrome Number");
        } else {
            System.out.println(n+" => Not a Palindrome Number");
        }
    }
}

// ------------------------------------------------------------------------------------------

// OUTPUT:

// 14541 => Palindrome Number
