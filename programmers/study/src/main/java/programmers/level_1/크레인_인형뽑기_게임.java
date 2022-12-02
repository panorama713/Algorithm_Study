package programmers.level_1;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : programmers.level_1
 * fileName : 크레인_인형뽑기_게임
 * author : gim-yeong-geun
 * date : 2022/11/25
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/11/25         gim-yeong-geun          최초 생성
 */
public class 크레인_인형뽑기_게임 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(new 크레인_인형뽑기_게임().solution(board, moves));
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> outBoard = new ArrayList<>();
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) {
                    outBoard.add(board[i][move - 1]);
                    board[i][move - 1] = 0;
                    break;
                }
            }
            if (outBoard.size() > 1) {
                if (outBoard.get(outBoard.size() - 1) == outBoard.get(outBoard.size() - 2)) {
                    answer += 2;
                    outBoard.remove(outBoard.size() - 1);
                    outBoard.remove(outBoard.size() - 1);
                }
            }
        }
        return answer;
    }
}
