package 기능개발;
import java.util.*;

public class Solution {
    public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList();
        for (int i : progresses) {
            arr.add(i);
        }
        ArrayList<Integer> sp = new ArrayList();
        for (int i : speeds) {
            sp.add(i);
        }
        while (!arr.isEmpty()) {
            int done = 0;
            for (int i = 0; i < arr.size(); i++) {
                if (i == 0 && arr.get(i) >= 100) {
                    arr.remove(i);
                    sp.remove(i);
                    done ++;
                    i--;
                    continue;
                }
                if (done == 0) {
                    arr.set(i, arr.get(i) + sp.get(i));
                }
            }
            if (done > 0) {
                answer.add(done);
            }
        }
        int[] ans = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            ans[i] = answer.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] p = new int[]{93, 30, 55};
        int[] s = new int[]{1, 30, 5};
        int [] ans = solution(p, s);
    }
}