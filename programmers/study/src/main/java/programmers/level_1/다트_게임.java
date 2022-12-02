package programmers.level_1;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * packageName : programmers.level_1
 * fileName : 다트_게임
 * author : gim-yeong-geun
 * date : 2022/12/01
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/12/01         gim-yeong-geun          최초 생성
 */
public class 다트_게임 {
    public static void main(String[] args) {
        String dartResult = "1S2D*3T";
        System.out.println(new 다트_게임().solution(dartResult));
    }

    public int solution(String dartResult) {
        int answer = 0;
        // 숫자 필터
        String numPattern = "[0-9]";
        // 결과값 배열로 변환
        List<String> dartResultList = Arrays.asList(dartResult.split(""));
        // 점수 저장용 리스트
        List<Integer> scoreList = new ArrayList<>();
        for (int i = 0; i < dartResultList.size() - 1; i++) {
            // 보너스 점수까지 계산
            if (Pattern.matches(numPattern, dartResultList.get(i))) {
                // 점수가 10점이라면
                if (Pattern.matches(numPattern, dartResultList.get(i + 1))) {
                    i++;
                    // 보너스 점수 계산
                    if (dartResultList.get(i + 1).equals("S")) {
                        scoreList.add((int) Math.pow(10, 1));
                    } else if (dartResultList.get(i + 1).equals("D")) {
                        scoreList.add((int) Math.pow(10, 2));
                    } else if (dartResultList.get(i + 1).equals("T")) {
                        scoreList.add((int) Math.pow(10, 3));
                    }
                } else {
                    int score = Integer.parseInt(dartResultList.get(i));
                    // 보너스 점수 계산
                    if (dartResultList.get(i + 1).equals("S")) {
                        scoreList.add((int) Math.pow(score, 1));
                    } else if (dartResultList.get(i + 1).equals("D")) {
                        scoreList.add((int) Math.pow(score, 2));
                    } else if (dartResultList.get(i + 1).equals("T")) {
                        scoreList.add((int) Math.pow(score, 3));
                    }
                }
            }
            if(dartResultList.get(i + 1).equals("*")){
                if(scoreList.size() > 1){
                    scoreList.set(scoreList.size()-2,scoreList.get(scoreList.size()-2) * 2);
                }
                scoreList.set(scoreList.size()-1,(scoreList.get(scoreList.size()-1) * 2));
            } else if (dartResultList.get(i + 1).equals("#")) {
                scoreList.set(scoreList.size()-1,(scoreList.get(scoreList.size()-1) * -1));
            }
        }
        for (int score : scoreList) {
            answer += score;
        }
        return answer;
    }
}
