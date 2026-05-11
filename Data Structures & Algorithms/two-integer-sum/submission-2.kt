class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            for (j in nums.indices) {
                if (i != j && nums[i]+nums[j] == target) {
                    return arrayOf(i, j).sorted().toIntArray()
                }
            }
        }
        return intArrayOf(0,0)
    }
}
