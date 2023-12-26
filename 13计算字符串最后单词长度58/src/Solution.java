/**
 * @基本功能:  计算单词长度  --字符串
 * @program:01base
 * @author:www wfg
 * @create:2023-12-24 11:54:06
 *
 *
 * 1，trim去除首尾的空格
 * 2，while从最后一个单词遍历  到字符串首部 与 遇到空格 结束
 *
 **/
public class Solution {

    public static int lengthOfLastWord(String s) {

//        去除字符串首尾的空格
        String trim = s.trim();

        int len = 0;//最后单词的长度
        int i = trim.length() - 1;//从最后一个单词开始遍历

//        结束条件 i < 0 或者 遇到空格   ‘ ’ 里面要有空格
//        当i >= 0 或者 不是空格时 进行循环
        while ( i >= 0 && trim.charAt(i) != ' '){
            len++;
            i--;
        }
        return len;
    }

    public static void main(String[] args) {
        // 示例字符串
        String s = "Hello World";
        // 调用 lengthOfLastWord 方法计算最后一个单词的长度
        int result = lengthOfLastWord(s);
        // 打印结果
        System.out.println("最后一个单词的长度是：" + result);
    }

}
