import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 用于记录历史数据需要的值
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                return new int[] { map.get(num), i };
            } else {
                map.put(target - nums[i], i);
            }
        }
        return new int[] {};
    }
}
// @lc code=end
