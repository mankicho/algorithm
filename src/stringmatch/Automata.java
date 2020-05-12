package stringmatch;

import java.util.Arrays;

public class Automata {

    int[][] table;

    public Automata(int[][] table, String tmp) {
        this.table = table;
        for (int i = 0; i < table.length; i++) {
            table[i][tmp.charAt(0) - 97] = 1;
        }
        for (int i = 1; i < tmp.length(); i++) {
            char c = tmp.charAt(i);
            table[i][c - 97] = i + 1;
        }
        System.out.println(Arrays.deepToString(table));
    }

    public int autoFun(int start, char s) {
        return table[start][s - 97];
    }


}
