import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character, Integer> m = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            m.put(c, c - 'a' + 1);
        }
        return m;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer, Integer> m = new HashMap<>();
        for (int e : nums){
            m.put(e, e * e);
        }
        return m;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String, Integer> m = new HashMap<>();
        for ( String w : words) {
            if (m.containsKey(w)) {
                m.put(w, m.get(w) + 1);
            }else{
                m.put(w, 1);
            }

        }
        return m;
    }
}
