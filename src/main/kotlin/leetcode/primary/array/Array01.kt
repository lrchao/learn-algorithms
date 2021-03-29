package leetcode.primary.array

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
    var i = 0  // 不重复指针-慢指针
    var j = 1  // 快指针

    while (j < nums.size) {
        if (nums[i] != nums[j]) { // 不重复项才需要操作
            i++ // 1.移动不重复指针指向下一个待填充位置： 避免：如果没有重复数据，q指向的元素原地复制了一遍
            if (i != j) { // 2.判断当前指针和不重复指针的差异，如果不等，说明不重复指针和快指针之间都是某个相等数字（否则，当前项是没移动过的，不能清空）
                nums[i] = nums[j]  // 3.把当前的值赋予不重复指针指针
            }
        }

        j++ // 4.移动快指针指向下一个待填充位置
    }

    // 返回不重复指针+1位置
    return i + 1
}