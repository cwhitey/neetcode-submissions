class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val trackerMap = mutableMapOf<Int, Int>()
        nums.forEach { i ->
            trackerMap[i] = trackerMap.getOrDefault(i, 0) + 1
        }

        println(trackerMap)

        return trackerMap.toList().sortedBy { (_, c) -> c }.reversed().take(k).map { (k, _) -> k }.toIntArray()
    }
}
