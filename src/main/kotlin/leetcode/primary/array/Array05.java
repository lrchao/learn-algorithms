package leetcode.primary.array;

/**
 * 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 *  异或：
 *  1。自身异或为0
 *  2。交换率和结合率
 *
 *
 */
public class Array05 {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        int n = singleNumber(nums);
        System.out.print("n=" + n);
    }


    public static int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            //  与自身做^为0
            single ^= num;
        }
        return single;
    }
}
