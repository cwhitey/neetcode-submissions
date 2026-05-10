class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        arr.forEachIndexed { index, i ->
            if (arr.getOrNull(index + 1) != null) {
                println(intArrayOf(i, arr[index + 1]).max())
                arr[index] = arr.sliceArray((index + 1)..(arr.size - 1)).max()
            } else {
                arr[index] = -1
            }
        }
        return arr
    }
}
