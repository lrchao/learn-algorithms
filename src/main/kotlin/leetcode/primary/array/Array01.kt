package leetcode.primary.array

/**
 * 删除排序数组中的重复项
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。

不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。

作者：力扣 (LeetCode)
链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2gy9m/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
fun main() {

    val nums = intArrayOf(1, 1, 3, 3, 5, 6, 9)
    nums.forEach { print(it) }
    val length = removeDuplicates(nums)
    println()
    println("length=$length")
    // 1356969  ,后面69是因为数组剩余的部分
    nums.forEach { print(it) }
}

fun removeDuplicates(nums: IntArray): Int {

    var show = 0
    var fast = 1

    while (fast < nums.size ){
        if (nums[show] != nums[fast]) {
            show++
            nums[show] = nums[fast]
        }
        fast++
    }

    return show + 1

}

