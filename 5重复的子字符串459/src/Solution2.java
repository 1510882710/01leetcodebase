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
 构建新的字符串 由新的字符串比较原来相等的，那么 是重复构成
 从原字符串中取出字符
 如何取出字符 charAt 单个字符  多个字符 subString
进行重复次数  repeat

 从哪里取出，哪个位置，什么时候 当是i的整数倍时

3,如果真的是可重复的，那么subString从0开始，必须有重复的

 *
 **/

class Solution2 {
    public static boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for(int i = 1; i <= length / 2; i++ ){

            if (length % i == 0) {
                String substring = s.substring(0, i);
                String repeat = substring.repeat(length / i);

                if (repeat.equals(s)) {
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