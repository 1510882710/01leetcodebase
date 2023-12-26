/**
 * @基本功能: 字符串中第一个匹配的下标  -- 双层for循环
 * @program:01base
 * @author:www wfg
 * @create:2023-12-24 11:54:06
 *
 * 给你两个字符串 haystack 和 needle ，haystack 和 needle 仅由小写英文字符组成
 * 在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
 * 如果 needle 不是 haystack 的一部分，则返回  -1 。

 * 示例 1：
 * 输入：haystack = "sadbutsad", needle = "sad"
 * 输出：0
 * 解释："sad" 在下标 0 和 6 处匹配。
 * 第一个匹配项的下标是 0 ，所以返回 0 。
 *
 * 示例 2：
 * 输入：haystack = "leetcode", needle = "leeto"
 * 输出：-1
 * 解释："leeto" 没有在 "leetcode" 中出现，所以返回 -1
 *
 * 第二次  双层for循环，首先是h的i++匹配时 第几个 h的下标，等于 n
 * 采用第二层循环，有 比较 h 与 n 是否相等
 * 相等时，返回此时的下标 i
 *
 **/
public class Solution2 {

    public static int strStr(String haystack, String needle) {

        int m = haystack.length();
        int n = needle.length();

        if (n > m) {
            return -1;
        }
        if ( n == 0){
            return 0;//"n" 在 "m" 中出现的位置为 0
        }

        for(int i = 0; i < m - n; i++ ){

            int j;
            for( j = 0; j < n; j++){

                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String  s = "sadbutsad";
        String t = "sad";
        String  s1 = "leetcode";
        String t1 = "leeto";
        String  s2 = "leetcode";
        String t2 = "eet";
        int str1 = strStr(s, t);
        int str2 = strStr(s1, t1);
        int str3 = strStr(s2, t2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

}
