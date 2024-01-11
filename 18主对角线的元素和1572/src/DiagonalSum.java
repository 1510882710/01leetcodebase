/**
 * @基本功能:
 * @program:01base
 * @author:www wfg
 * @create:2024-01-11 16:48:15
 **/
public class DiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        // 计算主对角线上的元素和
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
        }

        // 计算副对角线上的元素和（不包括主对角线上的元素）
        for (int i = 0; i < n; i++) {
            if (i != n - 1 - i) {
                sum += mat[i][n - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int result = diagonalSum(matrix);
        System.out.println("对角线元素的和为：" + result);
    }
}
