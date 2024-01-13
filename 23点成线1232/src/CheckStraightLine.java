public class CheckStraightLine {
    public static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length < 3) {
            return true;  // 少于三个点，直接认为在同一条直线上
        }

        // 计算前两个点的斜率
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        // 处理斜率为无穷大的情况
        if (x2 - x1 == 0) {
            for (int i = 2; i < coordinates.length; i++) {
                if (coordinates[i][0] != x1) {
                    return false;
                }
            }
            return true;
        }

        double initialSlope = (double) (y2 - y1) / (x2 - x1);

        // 检查后续点的斜率
        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            // 处理斜率为无穷大的情况
            if (x - x1 == 0) {
                return false;
            }

            double currentSlope = (double) (y - y1) / (x - x1);
            if (currentSlope != initialSlope) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = {{0, 0}, {0, 1}, {0, -1}};
        boolean result = checkStraightLine(coordinates);
        System.out.println(result);
    }
}
