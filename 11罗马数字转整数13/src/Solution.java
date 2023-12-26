import java.util.HashMap;
import java.util.Map;

/**
 * @基本功能:
 * @program:01base
 * @author:www wfg
 * @create:2023-12-24 11:54:06
 **/
public class Solution {



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
