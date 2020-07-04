package Chapter1;

public class Sum {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(solution(a, b));
    }

    public static long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (int i = b; i <= a; i++){
                answer += i;
            }
        }

        return answer;
    }
}
