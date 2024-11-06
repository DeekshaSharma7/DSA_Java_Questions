import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args){

        //Creating an Array
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0]= sc.nextInt();
        marks[1] =sc.nextInt();
        marks[2]=sc.nextInt();

        //Output
        System.out.println("maths : " +marks[0]);
        System.out.println("Eng : " +marks[1]);
        System.out.println("Hindi : " +marks[2]);

        //updating an array
        marks[2] =marks[2]+1;
        System.out.println(marks[2]);
    }
}
