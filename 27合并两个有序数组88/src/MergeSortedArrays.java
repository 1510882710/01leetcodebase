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

}
