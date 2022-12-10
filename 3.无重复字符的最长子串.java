import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start

// 一 暴力破解
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            int length=0;
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                Character c=s.charAt(j);
                if(set.contains(c)){
                    break;
                }else{
                    length++;
                    set.add(c);
                }
            }
            max=Math.max(max,length);
        }
        return max;
    }
}












// @lc code=end
