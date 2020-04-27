package dynamic;

public class LongestCommonSubsequence {

    private String str1;
    private String str2;

    public LongestCommonSubsequence(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }


    int counter = 0;

    public int lcs(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        } else if (str1.charAt(m) == str2.charAt(n)) {
            return lcs(m - 1, n - 1) + 1;
        } else {
            return max(lcs(m - 1, n), lcs(m, n - 1));
        }
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }


}
