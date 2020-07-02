package Chapter1;

import java.util.ArrayList;
import java.util.List;

public class Crain {
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        List<Integer> basket = new ArrayList<>();
        int answer = 0;
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    basket.add(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    break;
                } else {
                    continue;
                }
            }
            for (int j = 0; j < basket.size(); j++) {
                try {
                    if (basket.get(j) == basket.get(j + 1)) {
                        answer += 2;
                        basket.remove(j);
                        basket.remove(j);
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }
        return answer;
    }
}
