/**
 * @基本功能: 找不同  -- 字符串转换为字符串数组
 * @program:01base
 * @author:www wfg
 * @create:2023-12-24 11:54:06
 *
 * 给定两个字符串 s 和 t ，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 *
 * 示例 1：                                 示例 2：
 * 输入：s = "abcd", t = "abcde"            输入：s = "", t = "y"
 * 输出："e"                                输出："y"
 * 解释：'e' 是那个被添加的字母。
 *
 *定义s,t的总字符长度
 * 对每个字符串的字符求和
 * 两者相减
 * 结果强转为char 得出 新添加的字母
 *
 *
 *
 *
 **/
public class Solution3 {

    public static char findTheDifference(String s, String t) {
        int sumS = 0;
        int sumT = 0;

        for (char c : s.toCharArray()) {
            sumS += c;
        }

        for (char c : t.toCharArray()) {
            sumT += c;
        }

        return (char)(sumS - sumT);

    }

    public static void main(String[] args) {
       String  t = "abcd";
       String s = "abcde";
       char theDifference = findTheDifference(s, t);
        System.out.println(theDifference);
    }

}
