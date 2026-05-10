class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.isEmpty()) return true
        var sArray = s.toCharArray()
        var trackingArray = emptyArray<Char>()
        t.forEach {
            c -> if (sArray.isNotEmpty() && c == sArray[0]) {
                trackingArray += c
                sArray = sArray.sliceArray(1..<sArray.size)
            }
        }
        return trackingArray.joinToString("") == s
    }
}
