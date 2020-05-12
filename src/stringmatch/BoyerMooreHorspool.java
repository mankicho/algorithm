package stringmatch;

public class BoyerMooreHorspool {

    String s;
    String pattern;

    public BoyerMooreHorspool(String s, String pattern) {
        this.s = s;
        this.pattern = pattern;
    }

    // 점프를 사용하는 원시 알고리즘
    public void fun() {
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            table[c - 97] = pattern.length() - i - 1;
        }

        int i = pattern.length() - 1; // 토큰의 뒤에서부터 비교
        while (i < s.length()) {
            int j = pattern.length() - 1; // 패턴의 뒤에서부터 비교

            while (s.charAt(i) == pattern.charAt(j)) { // 글자가 같으면

                if (j == 0) {
                    System.out.println((i + 1) + "번째에서 매칭 발생.!!");
                    return;
                }
                i--;
                j--;
            }

            i += Math.max(table[s.charAt(i) - 97], pattern.length() - j);
        }
    }
}
