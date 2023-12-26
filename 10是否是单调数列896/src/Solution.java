/**
 * @基本功能:
 * @program:01base
 * @author:www wfg
 * @create:2023-12-24 11:54:06
 *
 * 如果数组是单调递增或单调递减的，那么它是 单调 的。
 * 如果对于所有 i <= j，nums[i] <= nums[j]，那么数组 nums 是单调递增的。 如果对于所有 i <= j，nums[i]> = nums[j]，那么数组 nums 是单调递减的。
 * 当给定的数组 nums 是单调数组时返回 true，否则返回 false。

 * 示例 1：
 * 输入：nums = [1,2,2,3]
 * 输出：true
 *
 **/
public class Solution {

    public static boolean isMonotonic(int[] nums) {
        boolean in = true;
        boolean de = true;

        for (int i =1; i < nums.length; i++){
            if ( nums[i] > nums[i-1]){
                de = false;
            }else if (nums[i] < nums[i-1]){
                in = false;
            }
        }

        return in || de;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        boolean result = isMonotonic(nums);
        System.out.println(result);

        int[] nums1 = {1, 2, 2, 3,1};
        boolean result1 = isMonotonic(nums1);
        System.out.println(result1);

        int[] nums12 = {3,2,1};
        boolean result12 = isMonotonic(nums12);
        System.out.println(result12);
    }

}
