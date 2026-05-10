class Solution {
    fun appendCharacters(s: String, t: String): Int {
        val sChars = s.toCharArray().toList()
        val tChars = t.toCharArray().toList()
        var counter = 0
        sChars.forEach {
            ch ->

            if (tChars.getOrNull(counter) == null) {
                return 0
            }
            if (ch == tChars[counter]) {
                counter++
            }
        }
        return tChars.size - counter
    }
}
