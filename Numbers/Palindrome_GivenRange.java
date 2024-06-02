public class Palindrome_GivenRange {
    public static boolean isPalindrome(int n) {
        int rev = 0;
        int org_num = n;
        while (org_num > 0) {
            int rem = org_num % 10;
            rev = (rev * 10) + rem;
            org_num = org_num/ 10;
        }
        if (n == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int min = 100;
        int max = 150;
        for (int i = min; i <= max; i++) {
            if (isPalindrome(i)) {
                System.out.println(i+" ");
            }
        }
    }
}
