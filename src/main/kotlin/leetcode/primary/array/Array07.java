package leetcode.primary.array;

import java.util.Arrays;

/**
 * 加一
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class Array07 {

    public static void main(String[] args) {
        int[] digits = {1, 2, 9};
        int[] result = plusOne(digits);
        System.out.print(Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {

        if (digits == null || digits.length <= 0) {
            return digits;
        }

        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int value = digits[i] + carry;
            digits[i] = value % 10;
            carry = value / 10;
        }
        if (carry == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);

            return result;
        }
        return digits;
    }
}


