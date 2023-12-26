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
 * 1,当n < m 时，直接返回-1
 * 2，当n = 0 时，返回 0
 * 3，采用for双层循环  i <= m - n
 * 二层for循环  j < n
 * 当 m.charAt(i+j) != n.   跳出内循环
 * 如果相等，应该是正常结束内循环
 * 不相等，跳出内循环
 *
 * 正常结束后，j == n
 * 返回 i
 *
 *
 *
 **/
public class Solution {

    public static int strStr(String haystack, String needle) {

        int m = haystack.length();
        int n = needle.length();


        if (n > m){
            return -1; //"n" 没有在 "m" 中出现，所以返回 -1
        }

        if ( n == 0){
            return 0;//"n" 在 "m" 中出现的位置为 0
        }

        for (int i = 0; i <= m-n; i++){
            int j;
            for ( j = 0; j < n; j++){
//                注意：是i + j 而不是  i
                if (haystack.charAt(i+j) != needle.charAt(j)){
                    break; //跳出内循环
                }
            }

            if ( j == n){ //当j=n时，内层循环正常结束，即n在m内，返回n在m中的起始坐标
                return i;
            }

        }

//      "n" 没有在 "m" 中出现，所以返回 -1
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
