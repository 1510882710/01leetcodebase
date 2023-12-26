/**
 * @基本功能: 重复子字符串
 * @program:01base
 * @author:www wfg
 * @create:2023-12-24 11:54:06
 *
 * 给定一个非空的字符串 s ，检查是否可以通过由它的一个子串重复多次构成。
 *
 * 示例 1:                            * 示例 2:           * 示例 3:
 * 输入: s = "abab"                   * 输入: s = "aba"   * 输入: s = "abcabcabcabc"
 * 输出: true                         * 输出: false       * 输出: true
 * 解释: 可由子串 "ab" 重复两次构成。                        * 可由子串 "abc" 重复四次构成 (或子串 "abcabc" 重复两次构成。)

 1，计算字符串长度
 2，for循环
    子字符串最长长度为一半 i < len / 2
    必须是整数倍  len%i == 0
   采用subString 取出 子字符串
   采用repeat进行重复子字符串
 比较新的字符串与s



 *
 **/

class Solution {
    public static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) {
                String sub = s.substring(0, i);
                String s2 = sub.repeat(len / i);

                if (s2.equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "abab";
        String s2 = "aba";
        String s3 = "abcabcabcabc";
        System.out.println((s1));
        System.out.println(repeatedSubstringPattern(s1)); // 输出 true
        System.out.println(repeatedSubstringPattern(s2)); // 输出 false
        System.out.println(repeatedSubstringPattern(s3)); // 输出 true
    }

}