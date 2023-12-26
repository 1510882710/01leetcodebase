/**
 * @基本功能:
 * @program:01base
 * @author:www wfg
 * @create:2023-12-24 11:54:06
 **/
public class Solution {
    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static String convertToUpper(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String s = "Hello";
        String result1 = convertToUpper(s);
        String result2 = toLowerCase(s);
        System.out.println("原本字符串：" + s + ",转变大写后：" + result1);
        System.out.println("原本字符串：" + s + ",转变小写后：" + result2);
    }

}
