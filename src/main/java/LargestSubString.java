import java.util.HashMap;
import java.util.Map;

public class LargestSubString {

    public static int lengthOfLongestSubstring(String s) {

       int ans = 0;
       int n = s.length();
       int j = 0;
       Map<Character, Integer> map = new HashMap<>();
       for (int i = 0; i < n; i++) {
           System.out.println("char# " + s.charAt(i));
           System.out.println("map#char# " + map.get(s.charAt(i)));
           if (map.containsKey(s.charAt(i))) {

               j = Math.max(map.get(s.charAt(i)), j);
           }
           ans = Math.max(ans, i - j + 1);
           map.put(s.charAt(i), i+1);

           System.out.println("i# " + i);
           System.out.println("j# " + j);
           System.out.println("ans# " + ans);

           System.out.println("----------------");
       }

        return ans;
    }

    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstring("aaaaa"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
