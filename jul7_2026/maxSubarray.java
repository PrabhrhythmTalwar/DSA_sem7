package jul7_2026;
//kadane's algo
public class maxSubarray {
        public int maxSubArray(int[] nums) {
            int currentSum = nums[0];
            int maxSum = nums[0];

            for (int i = 1; i < nums.length; i++) {
                currentSum = Math.max(nums[i], currentSum + nums[i]);
                maxSum = Math.max(maxSum, currentSum);
            }
            return maxSum;
        }
        public static void main(String[] args) {
    
            int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    
            maxSubarray obj = new maxSubarray();
    
            System.out.println(obj.maxSubArray(nums));
        }
}
