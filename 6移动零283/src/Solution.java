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
 *
 **/
public class Solution {
    public static void moveZeroes(int[] nums) {

        if(nums == null || nums.length == 0){
            return;
        }

        int nonZeroIndex = 0;

//        当第i个为0时，怎末办？   第1个下标是0时，non不加1 ，还是下标0，此时i为1；
//        第二次循环，就赋值了；直到最后i=len结束循环
//        此时，到第二个for循环，non就是最后几个？？？
//        i是什么时候结束    所有不为0的移到0前面时结束
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;  //没有0时，non就不变了
//                结束循环是i=len，但并不影响 non
//                第二个for循环，i又重新赋值了
            }
        }

//        将剩余的位置填充为0
        for (int i = nonZeroIndex; i < nums.length; i++){
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
