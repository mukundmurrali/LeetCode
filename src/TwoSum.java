public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int num1 = nums[i];
                int num2 = nums[j];
                if (num1 + num2 == target) {
                    return new int[] { i, j };
                }
            }
        }
        return nums;
    }

    public static void main(String args[]) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 17;
        int[] result = twoSum(nums, target);
        for (int data : result) {
            System.out.println(data);
        }
    }
}
