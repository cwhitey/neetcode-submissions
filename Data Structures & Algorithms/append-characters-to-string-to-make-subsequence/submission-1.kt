class Solution {
    fun appendCharacters(s: String, t: String): Int {
        val sChars = s.toCharArray().toList()
        var tChars = t.toCharArray().toList()
        var trackerChars = emptyArray<Char>()
        sChars.forEachIndexed {
            index, ch ->
            if (tChars.isEmpty()) {
                return 0
            }
            if (ch == tChars[0]) {
                trackerChars += tChars[0]
                tChars = tChars.slice(1..<tChars.size)
            }
        }
        return tChars.size
    }
}
