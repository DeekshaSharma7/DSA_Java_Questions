public class Patterns {
    //Hollow Rectangle
    public static void hollowRectangle(int n, int m){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i == 1 || j ==1 || i == n || j == m){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    
//     *****
//     *   *
//     *   *
//     *****

    public static void inverted_rotated_halfPyramid(int n){
        for(int i =1; i<=n;i++){
            for(int j=1; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//       *
//      **
//     ***
//    ****

public static void inverted_halfPyramid_withNumber(int n){
    for(int i=1; i<=n; i++){
        for(int j=1;j<=n-i+1; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}

    // 1234
    // 123
    // 12
    // 1

    public static void floyds_triangle(int n) {
        int number=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(number +" ");
                number++;
            }
            System.out.println();
        }
    }

//  1 
//  2 3 
//  4 5 6 
//  7 8 9 10

public static void zero_one_triangle(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i;j++ ){
            if((i+j)%2 == 0){ //even
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        System.out.println();
    }
}

// 1
// 01
// 101
// 0101

public static void butterfly(int n){
    // 1st half
    for(int i=1; i<=n; i++){
        //stars
        for(int j=1;j<=i; j++){
            System.out.print("*");
        }
        //spaces
        for(int j=1; j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //2nd Half
    for(int i=n; i>=1; i--){
        //stars
        for(int j=1;j<=i; j++){
            System.out.print("*");
        }
        //spaces
        for(int j=1; j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *

public static void solid_rhombus(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

//    ****
//   ****
//  ****
// ****

public static void hollow_rhombus(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n; j++){
            if(i==1 || j==1 || i==n || j==n){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        
        System.out.println();
    }
}

//    ****
//   *  *
//  *  *
// ****

public static void diamond(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n; i>=0; i--){
        for(int j=1; j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *

public static void number_pyramid(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4 

public static void palindrome_patttern_number(int n){
    for(int i=1; i<=n;i++){
        for(int j=1; j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=i; j>=1;j--){
            System.out.print(j);
        }
        for(int j=2; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}

//    1
//   212
//  32123
// 4321234

    public static void main(String[] args) {
        System.out.println("Hollow Rectangle");
        hollowRectangle(4, 5);
        System.out.println("Inverted Rotated Half Pyramid");
        inverted_rotated_halfPyramid(4);
        System.out.println("Inverted Half Pyramd with Numbers");
        inverted_halfPyramid_withNumber(4);
        System.out.println("Floyds Triangle");
        floyds_triangle(4);
        System.out.println("Zero One Triangle");
        zero_one_triangle(4);
        System.out.println("Butterfly Pattern");
        butterfly(4);
        System.out.println("Solid Rhombus");
        solid_rhombus(4);
        System.out.println("Hollow Rhombus");
        hollow_rhombus(4);
        System.out.println("Diamond Pattern");
        diamond(4);
        System.out.println("Number Pyramid");
        number_pyramid(4);
        System.out.println("Palindrome Pattern Number");
        palindrome_patttern_number(4);
    }


}
