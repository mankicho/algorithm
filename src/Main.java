import stringmatch.BoyerMooreHorspool;

import java.util.*;

public class Main {
    static int[][] table;

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        long a;
//        while ((a = scanner.nextLong()) != 0) {
//            double tmp = Math.sqrt(a);
//            boolean isSosu = true;
//            for (int i = 2; i < tmp; i++) {
//                if (a % i == 0) {
//                    isSosu = false;
//                }
//            }
//
//            if (isSosu) {
//                System.out.println("a는 소수이다");
//            } else {
//                System.out.println("a 는 소수가 아니다");
//            }
//        }
//        String pattern = "eeaab";
//        String s = "acebbceeaabceedb";
//

        String s = "aslcknesdjcnmainasckjemainscklsmcelskmalskdncmainsdlkcnemain";
        String pattern = "main";

        new BoyerMooreHorspool(s, pattern).fun();
    }
}




