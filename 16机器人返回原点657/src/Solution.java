/**
 * @基本功能:
 * @program:01base
 * @author:www wfg
 * @create:2023-12-24 11:54:06
 **/
public class Solution {
    public static void main(String[] args) {
        String moves = "UDLR"; // 替换成实际的移动顺序字符串
        boolean result = judgeCircle(moves);
        System.out.println(result);
    }

    public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }
        }

        return x == 0 && y == 0;
    }
}

