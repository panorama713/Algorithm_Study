package programmers.level_1;

import java.util.*;

/**
 * packageName : programmers.level_1
 * fileName : 실패율
 * author : gim-yeong-geun
 * date : 2022/11/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/11/27         gim-yeong-geun          최초 생성
 */
public class 실패율 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] result = new 실패율().solution(N, stages);
        System.out.println(Arrays.toString(result));
    }
    public int[] solution(int N, int[] stages) {
        // N 크기의 배열을 만듦
        HashMap<Integer, Double> challengingStageUser = new HashMap<>(){{
            for(int i=1; i<=N; i++){
                put(i,0.0);
            }
        }};
        // 멈춰있는 스테이지의 번호 -1의 value +1을 시킴
        for(int i=0; i< stages.length; i++){
            if(stages[i] > N){
                continue;
            }
            challengingStageUser.put(stages[i], challengingStageUser.get(stages[i]) + 1);
        }
        // 실패율 구하는 기능
        for(int i=1; i<=N; i++){
            int count = 0;
            for(int j=i; j<=N; j++){
                count += challengingStageUser.get(j);
            }
            for(int j=0; j< stages.length; j++){
                if(stages[j] > N){
                    count += 1;
                }
            }
            if(count != 0){
                challengingStageUser.put(i, challengingStageUser.get(i) / count);
            }
        }
        // 내림차순으로 정렬
        List<Integer> keySetList = new ArrayList<>(challengingStageUser.keySet());
        Collections.sort(keySetList, (o1, o2) -> (challengingStageUser.get(o2).compareTo(challengingStageUser.get(o1))));
        int[] result = new int[N];
        int i = 0;
        for(Integer key : keySetList){
            result[i] = key;
            i++;
        }
        return result;
    }
}
