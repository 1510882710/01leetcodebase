public class RichestCustomerWealth {
    public static void main(String[] args) {
        // 你的整数网格 accounts
        int[][] accounts = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maxWealth = maximumWealth(accounts);
        System.out.println("最富有客户的资产总量是: " + maxWealth);
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                // 计算当前客户在各家银行的资产总量
                currentWealth += accounts[i][j];
            }

            // 更新最大资产总量
            maxWealth = Math.max(maxWealth, currentWealth);
        }

        return maxWealth;
    }
}
