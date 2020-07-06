package Chapter1;

public class CountPandY {
    public static void main(String[] args) {
        String s = "pPoooyY";
        System.out.println(solution(s));
    }

    static boolean solution(String s) {
        boolean answer = false;
        int pCount = 0;
        int yCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 80 || s.charAt(i) == 112) {
                pCount++;
            } else if (s.charAt(i) == 89 || s.charAt(i) == 121) {
                yCount++;
            }
        }

        if (pCount == yCount) {
            answer = true;
        }
        return answer;
    }
}
