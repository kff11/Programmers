package Chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class DESC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(solution(scanner.next()));
    }

    public static String solution(String s) {
        String answer = "";
        int[] result = new int[s.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = s.charAt(i);
        }
        Arrays.sort(result);
        for (int i = result.length - 1; i >= 0; i--) {
            answer += (char) result[i];
        }
        return answer;
    }
}
