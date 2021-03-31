package leetcode.primary.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 */
public class Array04 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean result = containsDuplicate(nums);
        System.out.print("result=" + result);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;
    }
}
