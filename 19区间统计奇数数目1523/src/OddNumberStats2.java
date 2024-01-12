public class OddNumberStats2 {
    public static void printOddNumbersAndCount(int low, int high) {
        // 确保 low 是奇数，如果 low 是偶数，则增加 1
        if (low % 2 == 0) {
            low += 1;
        }

        // 确保 high 是奇数，如果 high 是偶数，则减少 1
        if (high % 2 == 0) {
            high -= 1;
        }

        // 输出奇数
        System.out.println("在 " + low + " 和 " + high + " 之间的奇数是：");
        for (int i = low; i <= high; i += 2) {
            System.out.print(i + " ");
        }

        // 计算奇数个数
        int oddCount = (high - low) / 2 + 1;
        System.out.println("\n在这个范围内的奇数个数是：" + oddCount);
    }

    public static void main(String[] args) {
        // 示例用法
        int low = 3;
        int high = 10;
        printOddNumbersAndCount(low, high);
    }
}
