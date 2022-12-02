package programmers.level_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/**
 * packageName : programmers.level_1
 * fileName : 숫자_문자열과_영단어
 * author : gim-yeong-geun
 * date : 2022/11/25
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/11/25         gim-yeong-geun          최초 생성
 */
public class 숫자_문자열과_영단어 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        new 숫자_문자열과_영단어().solution(s);
    }

    public int solution(String s) {
        HashMap<String, String> patterns = new HashMap<>();
        patterns.put("zero", "0");
        patterns.put("one", "1");
        patterns.put("two", "2");
        patterns.put("three", "3");
        patterns.put("four", "4");
        patterns.put("five", "5");
        patterns.put("six", "6");
        patterns.put("seven", "7");
        patterns.put("eight", "8");
        patterns.put("nine", "9");
        String str = s;
        for (String pattern : patterns.keySet()) {
            str = str.replaceAll(pattern, patterns.get(pattern));
        }
        System.out.println(str);
        int answer = Integer.parseInt(str);
        return answer;
    }
}
