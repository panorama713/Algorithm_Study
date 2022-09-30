package hackerrank;

import java.util.Scanner;

/**
 * packageName : hackerrank
 * fileName : Java_Output_Formatting
 * author : gim-yeong-geun
 * date : 2022/09/15
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/09/15         gim-yeong-geun          최초 생성
 */
public class Java_Output_Formatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line

            String s2 = "";
            while (s2.length() < 15 - s1.length()) {
                s2 += ' ';
            }

            if (x < 10) {
                System.out.println(s1 + s2 + "00" + x);
            } else if (x > 10 && x < 100) {
                System.out.println(s1 + s2 + "0" + x);
            } else {
                System.out.println(s1 + s2 + x);
            }
        }
        System.out.println("================================");

    }
}


