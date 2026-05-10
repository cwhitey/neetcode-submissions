class Solution {
    fun appendCharacters(s: String, t: String): Int {
        var counter = 0
        s.forEach {
            ch ->

            if (t.getOrNull(counter) == null) {
                return 0
            }
            if (ch == t[counter]) {
                counter++
            }
        }
        return t.length - counter
    }
}
