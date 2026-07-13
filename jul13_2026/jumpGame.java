package jul13_2026;

public class jumpGame {
    public static boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) { //if v cant even reach dis position, then v r stuck.
            if (i > maxReach) {
                return false;
            }
            //updatin the farthest index v can reach.
            maxReach = Math.max(maxReach, i + nums[i]); //if v can alrd reach the last index, no need to continue
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums1));

        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums2));

    }
}