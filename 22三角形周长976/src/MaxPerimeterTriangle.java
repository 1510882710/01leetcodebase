import java.util.Arrays;

public class MaxPerimeterTriangle {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 2};
        int result = largestPerimeter(nums);
        System.out.println(result);
    }
}
