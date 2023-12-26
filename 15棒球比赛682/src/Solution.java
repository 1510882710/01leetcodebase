import java.util.Stack;

/**
 * @基本功能:
 * @program:01base
 * @author:www wfg
 * @create:2023-12-24 11:54:06
 *
 *
 * 1，建立栈
 * 2,采用强for循环遍历数组
 * 3，比较数组内的字符，根据条件加减    是String
 *
 *  stack.pop()用于移除并返回栈顶的元素。
 *  stack.push入栈操作
 *  stack.peek()用于获取栈顶的元素而不将其移除
 *
 * Integer.parseInt(oper) 是一个 Java 中用于将字符串转换为整数的方法
 *
 *  + 前两次得分的总和
 *  首先要获取上一次分数 stack.pop()  因为此时栈顶不是上次分数  移除后，显示上次分数 lastRound
 *  stack.peek() 获取的是前二次的分数
 *  然后两次相加
 *  在家上一次移除的栈重新入栈
 *  接着将相加的数入栈
 *
 *   D
 *
 **/
public class Solution {

    public static int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();
        for (String oper : operations) {
            if (oper.equals("+")) {
                Integer lastRound = stack.pop();
                int newRound = lastRound + stack.peek();
//                将新旧两个分数重新入栈
                stack.push(lastRound);
                stack.push(newRound);
            }else if (oper.equals("D")) {
                stack.push(stack.peek() * 2);
            }else if (oper.equals("C")) {
                stack.pop();
            }else {
                stack.push(Integer.parseInt(oper));
            }

        }

        int totalScore = 0;
        for (int score : stack) {
            totalScore += score;
        }
        return totalScore;
    }

    public static void main(String[] args) {
        String[] ops = {"5", "2", "C", "D", "+"};
        int result = calPoints(ops);
        System.out.println(result); // 输出 30

    }

}
