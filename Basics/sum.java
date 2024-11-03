import java.util.*;

public class sum {
    public static void main(String[] args) {
        int x, y, sum;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = sc.nextInt();
        System.out.print("Enter the Second number: ");
        y = sc.nextInt();
        sum = sum(x, y);
        System.out.println("Sum of two numbers: " + sum);
        
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

// ********************************************
// Enter the first number: 65
// Enter the Second number: 85
// Sum of two numbers: 150