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
1,步骤就是 从最后一个开始遍历，加1
 2，剩下的就是考虑进位的情况
    判断 最后一位加1后是不是 等于10
 等于10后，令最后一位为0
 3，然后，将数组长度加1

 result是数组，
 *
 **/
public class Solution2 {

    public static int[] plusOne(int[] digits) {

//        之所以用循环，是因为当不用进位时，直接在最后一位结束了
//        需要进位时，每一个数字都需要加1
//        第二次循环时，无进位直接退出了
       for (int i = digits.length - 1; i >= 0; i--) {
           digits[i]++;

//           疑问1，i1 ！= 10如何 返回
//           首先返回digits 还是原本的吗  这不是没有加1
//           第二次错了，应该是相加后的 digits[i]
           if ( digits[i] != 10) {
               return digits;
           }else {
               digits[i] = 0;
           }

       }


        int[] results = new int[digits.length + 1];
        results[0] = 1;

        return results;

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
