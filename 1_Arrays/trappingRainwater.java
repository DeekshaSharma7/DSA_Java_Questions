// DSA Sheet No. 22;  Topic - Arrays;  Level - Medium
//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

// heigth = [4,2,0,6,3,2,5]
// (waterlevel - barLevel/heigth) * width = Trapped Water
// single baar => water trap = 0

// Two bar => 1)(less heigth bar)(more heigth bar)
// 2) (more heigth bar)(less heigth bar)
// 3) both have same heigth bar

// So, for trapping the water we want minimum number of bars >= 2

// we dont trap water in the order of ascending or descending order => No water is trap

// waterlevel = > min(max Left Boundary, max Right Boundary)

public class trappingRainwater {
    public static int trappedRainwater(int height[]){
        // calculate left max boundary - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], height[i-1]);
        }

        // calculate right max boundary - array
        int n = height.length;
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0; i<n; i++){
            // waterLevel = min(leftmax bound , rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightmax[i]);

            // trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
        public static void main(String[] args) {
        int height[]= {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }
}


// TC => O(n)