public class MaxSubarraySuma {

    //Brute code

     public static void maxSum_subArray(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length;j++){
                int end = j;
                currSum =0;
                for(int k=start; k<=end; k++){
                    //subArray Sum
                    currSum += num[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum : " +maxSum);
     }

    // TC = O(n^3)




     //Prefix Sum
     // prefix[end] - prefix[start - 1]  or prefix[i-1]+arr[i]
     // prefix[i-1] means previous sum
     public static void maxSubArrSum(int num[]){
        int currSum = 0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        //calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i=0; i<num.length;i++){
            int start = i;
            for(int j=i;j<num.length;j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] -prefix[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum is : " +maxSum);
     }

     // TC (with prefix sum) = O(n^2)


     //Kadane's algo

     // (+ve) + (+ve) = (+ve)
     // (big +ve) + (-ve) = (+ve)
     // +ve + (big -ve) = (-ve) => 0 So, in this case we can zero the big negative number

        // -2,-3,4,-1,-2,1,5,-3

     // CS |0|0|4|3|1|2|7|4|
     // MS |0|0|4|4|4|4|7|7|

     public static void kadanes(int num[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<num.length ; i++){
            cs = cs + num[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our Max Sum is : " +ms);
     }

     // TC => O(n) Kadanes Algo


     public static void main(String[] args) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        maxSum_subArray(num);
        maxSubArrSum(num);
        kadanes(num);
     }
}
