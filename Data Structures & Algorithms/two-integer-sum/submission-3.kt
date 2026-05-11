class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val current = nums[i]
            val needed = target - current
            if (needed in seen) {
                return intArrayOf(seen[needed]!!, i)
            }
            seen[current] = i
        }
        error("no solution")
    }
}
