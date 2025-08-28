package leetcode.easy.top100;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer result = new StringBuffer("");
        if(strs.length ==0 || strs[0].isBlank()) return result.toString();
        for(int i  = 0; i<strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            for(int j = 1; j<strs.length; j++){
                if(i>= strs[j].length() || ch != strs[j].charAt(i)){
                    return result.toString();
                }
            }
            result.append(ch);
        }
        return result.toString();

    }
}
