public class Greatest_3Number2 {
    public static void main(String[] args) {
        int n1 = 11;
        int n2 = 22;
        int n3 = 16;

        if ((n1 > n2) && (n1>n3)) {
            System.out.println("The Greatest Number is: "+n1);
        } else if ((n2 > n1) && (n2 > n3)) {
            System.out.println("The Greatest Number is: " +n2);
        } else {
            System.out.println("The Greatest Number is: " +n3);
        }
    }
}

--------------------------------------------------------------------------

    OUTPUT:
    The Greatest Number is: 22
