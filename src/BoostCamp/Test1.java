package BoostCamp;


public class Test1 {
    public static void main(String[] args) {
        int[][] v = {{1, 1}, {2, 2}, {1, 2}};
        System.out.println(solution(v)[0]);
        System.out.println(solution(v)[1]);
    }

    public static int[] solution(int[][] v) {
        int[] answer = new int[2];
        int x = v[0][0];
        int y = v[0][1];

        if (x == v[1][0]) {
            x = v[2][0];
        } else if (v[1][0] != v[2][0]) {
            x = v[1][0];
        }
        if (y == v[1][1]) {
            y = v[2][1];
        } else if (v[1][1] != v[2][1]) {
            y = v[1][1];
        }

        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}
