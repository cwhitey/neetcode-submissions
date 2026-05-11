class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var iResult = 0;
        var jResult = 0;
        for (i in nums.indices) {
            for (j in nums.indices) {
                if (i != j && nums[i]+nums[j] == target) {
                    iResult = i
                    jResult = j
                }
            }
        }
        return intArrayOf(iResult, jResult).sorted().toIntArray()
    }
}
