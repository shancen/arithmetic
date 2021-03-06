package leetcode.editor.cn.week03;

//给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,1,2]
//输出：
//[[1,1,2],
// [1,2,1],
// [2,1,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 8 
// -10 <= nums[i] <= 10 
// 
// Related Topics 数组 回溯 
// 👍 882 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// 这2题都不会做，参考的官方题解
public class PermuteUnique{
	public static void main(String[] args) {
		Solution solution = new PermuteUnique().new Solution();
		int [] nums = {1,2,3};
		solution.permuteUnique(nums);
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	boolean[] vis;

	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> perm = new ArrayList<Integer>();
		vis = new boolean[nums.length];
		Arrays.sort(nums);
		backtrack(nums, ans, 0, perm);
		return ans;
	}

	public void backtrack(int[] nums, List<List<Integer>> ans, int idx, List<Integer> perm) {
		if (idx == nums.length) {
			ans.add(new ArrayList<Integer>(perm));
			return;
		}
		for (int i = 0; i < nums.length; ++i) {
			if (vis[i] || (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1])) {
				continue;
			}
			perm.add(nums[i]);
			vis[i] = true;
			backtrack(nums, ans, idx + 1, perm);
			vis[i] = false;
			perm.remove(idx);
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
