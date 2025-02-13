package Algorithm.leetcode;

public class LongestCommonPrefix {
    //Write a function to find the longest common prefix string amongst an array of strings.
    public String longestCommonPrefix(String[]strs){
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 0; i < strs.length;i++){
            while(strs[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        System.out.println(solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"})); // Output: "fl"
        System.out.println(solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));    // Output: ""
        System.out.println(solution.longestCommonPrefix(new String[]{"dnterspecies", "dnterstellar", "dnterstate"})); // Output: "inters"
    }

}
