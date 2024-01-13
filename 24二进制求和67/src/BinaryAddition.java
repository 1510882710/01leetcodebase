public class BinaryAddition {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder(); // 用于存储最终结果的字符串
        int carry = 0; // 进位，初始值为0

        // 从字符串的末尾开始逐位相加
        int i = a.length() - 1, j = b.length() - 1;

        // 只要有一个字符串还有位没加完，或者还有进位，就继续循环
        while (i >= 0 || j >= 0 || carry > 0) {
            // 获取当前位的数字，如果已经没有位了，用0代替
            int numA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int numB = (j >= 0) ? b.charAt(j--) - '0' : 0;

            // 将当前位的数字与进位相加1
            int sum = numA + numB + carry;

            // 将相加的结果插入到结果字符串的开头
            result.insert(0, sum % 2);

            // 更新进位，即将和除以2得到的商作为新的进位
            carry = sum / 2;
        }

        return result.toString(); // 返回最终的二进制相加结果
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        String sum = addBinary(a, b);

        System.out.println("Binary Sum: " + sum);
    }
}
