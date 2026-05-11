class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        return nums.mapIndexed { i, a ->
            nums.filterIndexed { j, _ ->
                j != i
            }.fold(1) { c, d -> c * d }
        }.toIntArray()
    }
}
