package Chapter1;

public class Center {
    public static void main(String[] args) {
        String s = "qwer";
        System.out.println(solution(s));

    }
    public static String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 1){
            answer = String.valueOf(s.charAt(s.length() / 2));
        } else {
            answer = String.valueOf(s.charAt(s.length() / 2 - 1));
            answer += String.valueOf(s.charAt(s.length() / 2));

        }
        return answer;
    }
}
