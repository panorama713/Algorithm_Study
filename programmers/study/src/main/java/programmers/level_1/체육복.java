package programmers.level_1;

import java.util.Arrays;

/**
 * packageName : programmers.level_1
 * fileName : 체육복
 * author : gim-yeong-geun
 * date : 2022/12/01
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/12/01         gim-yeong-geun          최초 생성
 */
public class 체육복 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1,3,5};
        System.out.println(new 체육복().solution(n, lost, reserve));
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        // 배열 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        // 체육복을 가져온 학생 수
        answer += n - lost.length;
        // 체육복을 도난당하고 여분을 가지고 있는 학생 수
        for(int i=0; i<lost.length; i++){
            for(int j=0; j< reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer += 1;
                    // 계산한 배열을 무한대로 변경
                    lost[i] = 100;
                    reserve[j] = 200;
                }
            }
        }
        for(int i=0; i<lost.length; i++){
            for(int j=0; j< reserve.length; j++){
                if(lost[i] == reserve[j] - 1) {
                    answer += 1;
                    // 계산한 배열을 무한대로 변경
                    lost[i] = 100;
                    reserve[j] = 200;
                } else if (lost[i] == reserve[j] + 1) {
                    answer += 1;
                    // 계산한 배열을 무한대로 변경
                    lost[i] = 100;
                    reserve[j] = 200;
                }
            }
        }
        return answer;
    }
}
