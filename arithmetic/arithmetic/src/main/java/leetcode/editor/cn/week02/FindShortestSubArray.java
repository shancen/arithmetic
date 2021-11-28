package leetcode.editor.cn.week02;
//给定一个非空且只包含非负数的整数数组 nums，数组的度的定义是指数组里任一元素出现频数的最大值。 
//
// 你的任务是在 nums 中找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。 
//
// 
//
// 示例 1： 
//
// 
//输入：[1, 2, 2, 3, 1]
//输出：2
//解释：
//输入数组的度是2，因为元素1和2的出现频数最大，均为2.
//连续子数组里面拥有相同度的有如下所示:
//[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
//最短连续子数组[2, 2]的长度为2，所以返回2.
// 
//
// 示例 2： 
//
// 
//输入：[1,2,2,3,1,4,2]
//输出：6
// 
//
// 
//
// 提示： 
//
// 
// nums.length 在1到 50,000 区间范围内。 
// nums[i] 是一个在 0 到 49,999 范围内的整数。 
// 
// Related Topics 数组 哈希表 
// 👍 382 👎 0

import java.util.HashMap;
import java.util.Map;

public class FindShortestSubArray {
    public static void main(String[] args) {
        Solution solution = new FindShortestSubArray().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        Map<Integer, int[]> map = new HashMap<>();
        public int findShortestSubArray(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    int[] values = map.get(nums[i]);
                    values[0]++;
                    values[2] = i;
                    map.put(nums[i], values);
                } else {
                    map.put(nums[i], new int[]{1, i, i});
                }
            }

            // 遍历map，比较出现次数和长度
            int maxCount = 0;
            int minLen = 0;
            for (Map.Entry<Integer, int[]> integerEntry : map.entrySet()) {
                int[] value = integerEntry.getValue();
                if (value[0] > maxCount) {
                    maxCount = value[0];
                    minLen = value[2] - value[1] + 1;
                } else if (value[0] == maxCount) {
                    // 比较谁最短
                    if (value[2] - value[1] + 1 <= minLen) {
                        minLen = value[2] - value[1] + 1;
                    }
                }

            }
            return minLen;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
