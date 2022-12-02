package programmers.level_1;

/**
 * packageName : programmers.level_1
 * fileName : 신규_아이디_추천
 * author : gim-yeong-geun
 * date : 2022/11/25
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/11/25         gim-yeong-geun          최초 생성
 */
public class 신규_아이디_추천 {
    public static void main(String[] args) {
        String str = "z-+.^.";
        new 신규_아이디_추천().solution(str);
    }

    public String solution(String new_id) {
        new_id = lowerChange(new_id);
        new_id = patternChange(new_id);
        new_id = dotChange(new_id);
        new_id = dotDelete(new_id);
        new_id = emptyCheck(new_id);
        new_id = rangeOverCheck(new_id);
        new_id = rangeLowerCheck(new_id);
        String answer = new_id;
        System.out.println(answer);
        return answer;
    }

    // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
    public String lowerChange(String new_id) {
        String result = new_id.toLowerCase();
        return result;
    }

    // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
    public String patternChange(String new_id) {
        String pattern = "[^a-z/\\d/./\\-/_]";
        String pattern2 = "[^a-z|\\d|.|\\-|_]";
        String result = new_id.replaceAll(pattern2, "");
        return result;
    }

    //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
    public String dotChange(String new_id) {
        String pattern = "[.]+";
        String result = new_id.replaceAll(pattern, ".");
        return result;
    }

    //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
    public String dotDelete(String new_id) {
        String[] idList = new_id.split("");
        String result = "";
        if (idList[0].equals(".")) {
            idList[0] = "";
        }
        if (idList[idList.length - 1].equals(".")) {
            idList[idList.length - 1] = "";
        }
        for (String id : idList) {
            result += id;
        }
        return result;
    }

    // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
    public String emptyCheck(String new_id) {
        if (new_id.length() == 0) {
            return "a";
        }
        return new_id;
    }

    //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
    //     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
    public String rangeOverCheck(String new_id) {
        String result = "";
        String[] idArr = new_id.split("");
        if(idArr.length >= 16){
            for(int i=0; i<15; i++){
                result += idArr[i];
            }
            result = dotDelete(result);
            return result;
        }
        return new_id;
    }

    //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
    public String rangeLowerCheck(String new_id){
        String result = "";
        String[] idArr = new_id.split("");
        if(idArr.length <= 2){
            for(int i=0; i< idArr.length; i++){
                result += idArr[i];
            }
            for(int i=0; i< 3 - idArr.length; i++){
                result += idArr[idArr.length - 1];
            }
            return result;
        }
        return new_id;
    }
}
