/**
 * @基本功能:
 * @program:01base
 * @author:www wfg
 * @create:2024-01-28 16:11:36
 *
 *  采用二分法查找
 *  给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 *
 **/
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // 如果循环结束仍未找到目标值，返回插入位置（即左指针所在位置）
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = searchInsert(nums, target);
        System.out.println(result);
    }
}
