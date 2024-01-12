public class OddNumberCounter {
    public static int countOddNumbers(int low, int high) {
        // 确保 low 是奇数，如果 low 是偶数，则增加 1
        if (low % 2 == 0) {
            low += 1;
        }

        // 确保 high 是奇数，如果 high 是偶数，则减少 1
        if (high % 2 == 0) {
            high -= 1;
        }

        // 计算奇数个数
        int oddCount = (high - low) / 2 + 1;

        return oddCount;
    }

    public static void main(String[] args) {
        // 示例用法
        int low = 3;
        int high = 10;
        int result = countOddNumbers(low, high);
        System.out.println("在 " + low + " 和 " + high + " 之间的奇数个数是：" + result);
    }
}
