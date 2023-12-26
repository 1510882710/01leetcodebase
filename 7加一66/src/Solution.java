import java.util.Arrays;

/**
 * @基本功能: 加1   数组运算
 * @program:01base
 * @author:www wfg
 * @create:2023-12-24 11:54:06
 *
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。

 * 示例 1：                  * 示例 2：                   * 示例 3：
 * 输入：digits = [1,2,3]    * 输入：digits = [4,3,2,1]   * 输入：digits = [0]
 * 输出：[1,2,4]             * 输出：[4,3,2,2]            * 输出：[1]
 * 解释：输入数组表示数字 123。 * 解释：输入数组表示数字 4321。

重点：考虑到9+1 = 10的进位情况

 *
 **/
public class Solution {

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length-1; i >= 0; i--){
            digits[i]++;

            if (digits[i] != 10){
                return digits;
            }else {
                //进位 加1 所以最后一位为0
                digits[i] = 0;
//                什么时候结束循环
            }
        }
//            当最后发生了进位，前一位+1 且数组长度+1
        int[] result = new int[digits.length + 1];
        result[0] = 1;  //为什么

/***
 else及result是在进位的情况下 才会执行
 不进位直接在if中出去了
 */
        return result;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] result1 = plusOne(digits1);
// 输出结果应该为 [1, 2, 4]
        System.out.println(Arrays.toString(result1));

        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = plusOne(digits2);
// 输出结果应该为 [4, 3, 2, 2]
        System.out.println(Arrays.toString(result2));

        int[] digits3 = {9, 9};
        int[] result3 = plusOne(digits3);
// 输出结果应该为 [1, 0, 0]
//        本质上是一个整数
        System.out.println(Arrays.toString(result3));


        int[] digits4 = {1};
        int[] result4 = plusOne(digits4);
// 输出结果应该为 [1]
        System.out.println(Arrays.toString(result4));

    }

}
