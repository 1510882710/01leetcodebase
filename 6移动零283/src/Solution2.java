import java.util.Arrays;

/**
 * @基本功能: 移动0 -- 数组，指针
 * @program:01base
 * @author:www wfg
 * @create:2023-12-24 11:54:06
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。

 * 示例 1:                       * 示例 2:
 * 输入: nums = [0,1,0,3,12]     * 输入: nums = [0]
 * 输出: [1,3,12,0,0]            * 输出: [0]
 *
 *情况1：
 * 数组长度为0 或 空数组
 * 情况2：
 * 采用指针进行解答
 * 定义0位置
 * 其他字符依次向前移动
 * 2个for循环
 * 第一个for循环 以 i = len结束 此时 m 是0位置
 * 第二个for 令 i = m 然后将0移到后面
 *
 **/
public class Solution2 {
    public static void moveZeroes(int[] nums) {

        if (nums.length == 0 || nums == null) {
            return;
        }

        int m = 0;

       for (int i = 0; i < nums.length; i++) {
           if (nums[i] != 0) {
               nums[m] = nums[i];
               m++;
           }
       }

       for (int i = m; i < nums.length; i++) {
           nums[i] = 0;

       }


    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1)); // 输出: [1, 3, 12, 0, 0]

        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2)); // 输出: [0]

        int[] nums3 = {};
        moveZeroes(nums3);
        System.out.println(Arrays.toString(nums3)); // 输出:
    }
}
