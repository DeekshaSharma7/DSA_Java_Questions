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

    public static void main(String[] args) {
        hollowRectangle(4, 5);
        inverted_rotated_halfPyramid(4);
        inverted_halfPyramid_withNumber(4);
        floyds_triangle(4);
    }


}
