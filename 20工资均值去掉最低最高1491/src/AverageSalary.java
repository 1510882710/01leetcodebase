import java.util.Arrays;

public class AverageSalary {
    public static double calculateAverage(int[] salary) {
        // 排序工资数组
        Arrays.sort(salary);

        // 计算剔除最低和最高工资后的平均工资
        double sum = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }

        return sum / (salary.length - 2);
    }

    public static void main(String[] args) {
        // 示例用法
        int[] salaryArray = {1000, 2000, 3000, 4000, 5000};
        double result = calculateAverage(salaryArray);
        System.out.println("去掉最低工资和最高工资后的平均工资是: " + result);
    }
}
