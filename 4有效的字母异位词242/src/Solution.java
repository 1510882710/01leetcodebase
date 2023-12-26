import java.util.Arrays;

/**
 * @基本功能: 有效字母异位词  -- 字符串->数组
 * @program:01base
 * @author:www wfg
 * @create:2023-12-24 11:54:06
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 仅包含小写字母
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。

 * 示例 1:                                   * 示例 2:
 * 输入: s = "anagram", t = "nagaram"        * 输入: s = "rat", t = "car"
 * 输出: true                                * 输出: false
 *
 * 1，是判断两个长度不一样
 * 2，
 * tochary()
 * sort()
 * 判断s与t是否相等
 * 采用数组进行比较 Arrays.equals(s1,t1)
 *
 *
 **/
public class Solution {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

//        数组对其进行排序
        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1,t1);

    }


    public static void main(String[] args) {
        String  s = "abcd";
        String t = "abcde";
        String  s1 = "anagram";
        String t1 = "nagaram";
        boolean b = isAnagram(s, t);
        boolean anagram = isAnagram(s1, t1);
        System.out.println(b);
        System.out.println(anagram);
    }

}
