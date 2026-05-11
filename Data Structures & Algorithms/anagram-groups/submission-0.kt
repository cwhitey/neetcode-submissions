class Solution {
   fun groupAnagrams(strs: Array<String>): List<List<String>> {
        return strs.groupBy { s -> s.toCharArray().sorted().joinToString("") }.values.toList()
   }
}
