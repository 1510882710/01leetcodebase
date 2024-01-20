/**
 * @基本功能:交替合并字符串 -- 字符串拼接
 * @program:01base
 * @author:www wfg
 * @create:2023-12-24 11:54:06
 * <p>
 * 给你两个字符串 word1 和 word2 。请你从 word1 开始，通过交替添加字母来合并字符串。
 * 如果一个字符串比另一个字符串长，就将多出来的字母追加到合并后字符串的末尾。
 * 返回 合并后的字符串 。
 * <p>
 * 示例 1：
 * 输入：word1 = "abc", word2 = "pqr"
 * 输出："apbqcr"
 * 解释：字符串合并情况如下所示：
 * word1：  a   b   c
 * word2：    p   q   r
 * 合并后：  a p b q c r
 * <p>
 * <p>
 * 1，计算两个字符串长度          s.length()
 * 2,创建StringBuilder对象      new StringBuilder();
 * 3，采用while循环，将字符串转换为字符数组拼接  append()
 * 4，取出第i个数组              charAt(i)
 * 5,重新写出的数组转换为字符串     toString()
 * <p>
 * String
 * StringBuilder  单线程
 * StringBuffer    多线程
 **/


/*
  第二次做，要采用while循环，而不是for
  采用 || 分别进行 比较，分别用append添加
       */
public class Solution3 {
    public static String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int i = 0;
        int j = 0;

        StringBuffer stringBuffer = new StringBuffer();
        while (i < m || j < n) {
            if (i < m) {
                stringBuffer.append(word1.charAt(i));
                ++i;
            }

            if (j < n) {
                stringBuffer.append(word2.charAt(j));
                ++j;
            }


        }
        return stringBuffer.toString();


    }

    public static void main(String[] args) {
        String s1 = "abcgg";
        String s2 = "def";
        String s = mergeAlternately(s1, s2);
        System.out.println(s);
    }


}
