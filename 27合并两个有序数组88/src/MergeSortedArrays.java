/**
 * @基本功能:
 * @program:01base
 * @author:www wfg
 * @create:2024-01-29 11:17:59
 **/
public class MergeSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        指向nums1的末尾
        int i = m -1;
//        指向num2的末尾
        int j = n -1;
//        指向合并数组的末尾
        int k = m + n - 1;

//        从后向前比较合并
        while ( i >= 0 && j >= 0){
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            }else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
    public static void main(String[] args) {
        // 示例输入
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;

        // 合并数组
        merge(nums1, m, nums2, n);

        // 输出合并后的数组
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
