import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @基本功能:
 * @program:01base
 * @author:www wfg
 * @create:2023-12-24 11:54:06
 *
 * 给你一个数字数组 arr 。
 * 如果一个数列中，任意相邻两项的差总等于同一个常数，那么这个数列就称为 等差数列 。
 * 如果可以重新排列数组形成等差数列，请返回 true ；否则，返回 false 。

 * 示例 1：
 * 输入：arr = [3,5,1]
 * 输出：true
 * 解释：对数组重新排序得到 [1,3,5] 或者 [5,3,1] ，任意相邻两项的差分别为 2 或 -2 ，可以形成等差数列。
 *
 * 等差数列  a[i] * 2 = a[i-1] + a[i+1]
 * 三个及三个以上为等差数列
 *
 *  第一步：需要对数组进行排序
 *
 *  相减
 *
 *
 **/
public class Solution2 {

    public static boolean canMakeArithmeticProgression(int[] arr) {

       Arrays.sort(arr);
//       建立哈希数组
        HashSet<Object> dif = new HashSet<>();
        for (int i =1; i < arr.length; i++) {
//            将插值添加到数组
            dif.add(arr[i] - arr[i-1]);
       }

//        比较数组里面不同的数，只有1个数
       return dif.size() == 1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1};
        boolean result = canMakeArithmeticProgression(arr);
        System.out.println(result);

        int[] arr1 = {3};
        boolean result1 = canMakeArithmeticProgression(arr1);
        System.out.println(result1);

        int[] arr12 = {3,1};
        boolean result12 = canMakeArithmeticProgression(arr12);
        System.out.println(result12);
    }

}
