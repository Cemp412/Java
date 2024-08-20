public class TrappedRainWater {
    public static int trappedWater(int height[], width) {
        int n = height.length;
        //calculate left max boundary -array
        int leftMaxArr[] = new int[height.length];
        leftMaxArr[0] = height[0];

        //loop declaration
        for(int i=1; i < n; i++) {
            leftMaxArr[i] = Math.max(height[i], leftMaxArr[i-1]);
        }
        //claculate right max boundary - array
        int rightMaxArr[] = new int[height.length];
        rightMaxArr[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--) {
            rightMaxArr[i] = Math.max(height[i], rightMaxArr[i + 1]);
        }

        int trappedWater = 0;
        for(int i=0; i< n; i++) {
            //calculate water level = min(max left bound, max right bound)
            int waterLevel = Math.min(leftMaxArr[i], rightMaxArr[i]);
            //calculate trapped water = (water level- height) * width;
            trappedWater += (waterLevel - height[i]) * width;
        }

        return trappedWater;
    }

    //declaration of main function
    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int width = 1;
        System.out.println(trappedWater(height, width));
    }
}