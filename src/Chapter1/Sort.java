package Chapter1;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(solution(strings, n)[0]);
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(n) - o2.charAt(n) != 0 ? o1.charAt(n) - o2.charAt(n) : o1.compareTo(o2);
            }
        });
        return strings;
    }
}
