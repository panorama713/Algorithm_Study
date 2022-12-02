package programmers.level_1;

import java.util.HashMap;
import java.util.List;

/**
 * packageName : programmers.level_1
 * fileName : 성격_유형_검사
 * author : gim-yeong-geun
 * date : 2022/11/24
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/11/24         gim-yeong-geun          최초 생성
 */
public class 성격_유형_검사 {
    public static void main(String[] args) {
        String[] survey1 = {"AN", "CF", "MJ", "RT", "NA"};
        String[] survey2 = {"TR", "RT", "TR"};
        int[] choices1 = {5, 3, 2, 7, 5};
        int[] choices2 = {7, 1, 3};
        String result = solution(survey1,choices1);
        System.out.println(result);
    }
    private static HashMap<String, Integer> score = new HashMap<>() {{
        put("R", 0);
        put("T", 0);
        put("C", 0);
        put("F", 0);
        put("J", 0);
        put("M", 0);
        put("A", 0);
        put("N", 0);
    }};

    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        for (int i = 0; i < survey.length; i++) {
            setScore(survey[i], choices[i]);
        }
        answer = result();
        return answer;
    }

    public static void setScore(String survey, int choices) {
        String[] item = survey.split("");
        if (choices > 0 && choices < 4) {
            score.put(item[0], score.get(item[0]) + choiceToScore(choices));
            return;
        }
        if (choices > 4 && choices < 8) {
            score.put(item[1], score.get(item[1]) + choiceToScore(choices));
            return;
        }
    }

    public static int choiceToScore(int choices) {
        int answer = 0;
        if (choices == 1 || choices == 7) {
            answer = 3;
        } else if (choices == 2 || choices == 6) {
            answer = 2;
        } else if (choices == 3 || choices == 5) {
            answer = 1;
        } else if (choices == 4) {
            answer = 0;
        } else {
            return 0;
        }
        return answer;
    }

    public static String result() {
        String answer = "";
        // R, T
        if (score.get("R") > score.get("T")) {
            answer += "R";
        } else if (score.get("R") < score.get("T")) {
            answer += "T";
        } else {
            answer += "R";
        }
        // C, F
        if (score.get("C") > score.get("F")) {
            answer += "C";
        } else if (score.get("C") < score.get("F")) {
            answer += "F";
        } else {
            answer += "C";
        }
        // J, M
        if (score.get("J") > score.get("M")) {
            answer += "J";
        } else if (score.get("J") < score.get("M")) {
            answer += "M";
        } else {
            answer += "J";
        }
        // A, N
        if (score.get("A") > score.get("N")) {
            answer += "A";
        } else if (score.get("A") < score.get("N")) {
            answer += "N";
        } else {
            answer += "A";
        }
        return answer;
    }
}
