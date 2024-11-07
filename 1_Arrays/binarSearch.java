public class binarSearch {

    public static int binarySearch(int num[], int key){
        int start = 0;
        int end = num.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            if(num[mid] == key){ //found
                return mid;
            }
            if(num[mid] < key){ // right
                start =  mid+1;
            } else {
                end = mid-1; //left
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,16,18};
        int key = 20;
        System.out.println("index for key is : " + binarySearch(num, key));

    }
}

//TC is directly proportional to logn base 2.
// TC => O(logn)
