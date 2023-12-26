import java.util.HashMap;
import java.util.Map;

/**
 * @基本功能:
 * @program:01base
 * @author:www wfg
 * @create:2023-12-24 11:54:06
 **/
public class Solution {



    public static String intToRoman(int num) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();
        int i = 0;

        while (num > 0){
            if (num >= values[i]){
                roman.append(symbols[i]);
                num -= values[i];
            }else {
                i++;
            }
        }


        return roman.toString();


    }

    public static void main(String[] args) {
        int num = 3;
        String result = intToRoman(num);
        System.out.println(result);
    }

}
