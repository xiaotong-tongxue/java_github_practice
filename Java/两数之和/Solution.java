// 必须加 public，否则命令行运行时找不到主类
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    // 测试用main方法
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] testNums = {2, 7, 11, 15};
        int testTarget = 9;
        int[] result = solution.twoSum(testNums, testTarget);
        System.out.println("结果下标: " + result[0] + ", " + result[1]);
    }
}