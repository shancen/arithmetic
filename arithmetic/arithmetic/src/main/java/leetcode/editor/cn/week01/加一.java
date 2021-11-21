package leetcode.editor.cn.week01;

//给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = [1,2,3]
//输出：[1,2,4]
//解释：输入数组表示数字 123。
// 
//
// 示例 2： 
//
// 
//输入：digits = [4,3,2,1]
//输出：[4,3,2,2]
//解释：输入数组表示数字 4321。
// 
//
// 示例 3： 
//
// 
//输入：digits = [0]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= digits.length <= 100 
// 0 <= digits[i] <= 9 
// 
// Related Topics 数组 数学 
// 👍 860 👎 0

public class 加一{
	public static void main(String[] args) {
		Solution solution = new 加一().new Solution();
		for (int i : solution.plusOne(new int[]{9, 9, 9})) {
			System.out.print(i);
		}
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public  int[] plusOne(int[] nums) {

		for (int i = nums.length - 1; i >= 0; i--) {
			nums[i]++;
			nums[i] = nums[i] % 10;
			if (nums[i] != 0) {
				return nums;
			}
		}
		nums = new int[nums.length + 1];
		nums[0] = 1;
		return nums;
	}
	// public int[] plusOne(int[] nums) {

	//     int[] nums2 = new int[nums.length + 1];
	//     int index = 0;
	//     for (int i = nums.length - 1; i >= 0; i--) {
	//         if (nums[i] != 9) {
	//             nums[i] = nums[i] + 1;
	//             break;
	//         } else {
	//             index++;
	//             if (index == nums.length) {
	//                 nums2[0] = 1;
	//                 return nums2;
	//             }
	//             nums[i] = 0;
	//         }
	//     }
	//     return nums;
	// }
}

}
