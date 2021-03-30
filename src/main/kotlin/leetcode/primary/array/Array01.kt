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

