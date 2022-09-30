package baekjoon;

import java.util.Scanner;

/**
 * packageName : baekjoon
 * fileName : q_3003
 * author : gim-yeong-geun
 * date : 2022/09/06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/09/06         gim-yeong-geun          최초 생성
 */
public class q_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cont = new int[6];
        int[] full = new int[]{1,1,2,2,2,8};
        for(int i=0; i<6; i++){
            cont[i] = sc.nextInt();
        }
        for(int i=0; i< full.length; i++){
            cont[i] = full[i] - cont[i];
            System.out.println(cont[i]);
        }
    }
}
