/**
 * @基本功能: 数组元素乘积的正负   for增强循环  注意乘积的溢出
 * @program:01base
 * @author:www wfg
 * @create:2023-12-24 11:54:06
 *
 * 已知函数 signFunc(x) 将会根据 x 的正负返回特定值：
 * 如果 x 是正数，返回 1 。
 * 如果 x 是负数，返回 -1 。
 * 如果 x 是等于 0 ，返回 0 。
 * 给你一个整数数组 nums 。令 product 为数组 nums 中所有元素值的乘积。
 * 返回 signFunc(product) 。
 *
 * 示例 1：
 * 输入：nums = [-1,-2,-3,-4,3,2,1]
 * 输出：1
 * 解释：数组中所有值的乘积是 144 ，且 signFunc(144) = 1
 *
 * 遍历每一个数组，会有成绩溢出
 *
 * 第二种方法：
 * for循环，强行遍历每一个数组元素，
 * 假定符号为1 是正数，
 * 小于0  取反  为什么
 *循环后，按照出现的次数进行判定，当负数出现奇数个，乘积一定是负数
 **/
public class Solution2 {
    public static int arraySign(int[] nums) {

       int sign =1;
       for (int num : nums) {
           if (num == 0) {
               return 0;
           }
           if (num < 0) {
               sign = -sign;
           }
       }
       return sign;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int i = arraySign(digits1);
        System.out.println(i);

        int[] digits12= {1, 2, 3,-1};
        int i1 = arraySign(digits12);
        System.out.println(i1);

        int[] digits123= {1, 2, 3,-1,0};
        int i12 = arraySign(digits123);
        System.out.println(i12);

        int[] s=  {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        int s1 = arraySign(s);
        System.out.println(s1);
    }

}
