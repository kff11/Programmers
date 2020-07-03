package Chapter1;


import java.util.ArrayList;
import java.util.List;

public class GymSuit {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 3};
        int[] reserve = {3, 4};
        System.out.println(solution(n, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        List<Integer> reserveList = new ArrayList<>();
        for (int i : reserve) {
            reserveList.add(i);
        }
        List<Integer> lostList = new ArrayList<>();
        for (int i : lost) {
            lostList.add(i);
        }
        for (int i = 0; i <reserveList.size(); i++) {
            if(lostList.contains(reserveList.get(i))){
                lostList.remove((Integer) reserveList.get(i));
                reserveList.remove(i);
                i--;
                answer++;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < lostList.size(); j++) {
                if (i == lostList.get(j)) {
                    if (reserveList.contains(i)) {
                        answer++;
                        reserveList.remove((Integer) i);
                        break;
                    }
                    if (reserveList.contains(i + 1)) {
                        answer++;
                        int delete = i + 1;
                        reserveList.remove((Integer) delete);
                        break;
                    }
                    if (reserveList.contains(i - 1)) {
                        answer++;
                        int delete = i - 1;
                        reserveList.remove((Integer) delete);
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
