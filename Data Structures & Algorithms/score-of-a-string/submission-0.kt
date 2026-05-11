class Solution {
    fun scoreOfString(s: String): Int {
        return s.zipWithNext().fold(0) { n, (c1, c2) ->
            (c2.code - c1.code).absoluteValue + n }
    }
}
