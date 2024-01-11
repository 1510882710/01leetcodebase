import java.util.HashMap;
import java.util.Map;

/**
 * @基本功能:
 * @program:01base
 * @author:www wfg
 * @create:2023-12-24 11:54:06
 *
 * 小的数字在大的数字右边 相减
 * 其余
 *
 *
 * 首先建立哈希数组 key value
 * for循环
 * 哈希组 获取里面数值 get()
 *根据得到的罗马数字，对应的value数值，有比较大小
 *
 **/
public class Solution2 {



    public static int romanToInt(String s) {

        Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++){
            int value = symbolValues.get(s.charAt(i));
//            从0开始，到数字长度结束
//            当 i < n 与 value 小于获取值第二个
//            从0 开始 小于1 否则,加上 例如III I对应1 小于 i+1 那么
//            罗马数字从左向右遍历
            if (i < n-1 && value < symbolValues.get(s.charAt(i+1))){
                ans -= value;
            }else {
                ans += value;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String  s = "III";
        int i = romanToInt(s);
        System.out.println(i);
    }

}
