package leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            throw new IllegalArgumentException();
        }

        if (strs.length == 0) {
            return "";
        }

        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {

            while (strs[i].indexOf(result) != 0) {
                if (result.equals("")) {
                    return "";
                }

                result = result.substring(0, result.length() - 1);
            }
        }

        return result;
    }

}
