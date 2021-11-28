package Budget;
import java.util.*;
public class Solution {
    public int solution(int[] d, int budget) {
        int i = 0;
        int answer = 0;
        Arrays.sort(d);
        while (i < d.length && budget - d[i] >= 0) {
            budget -= d[i];
            i++;
            answer++;
        }
        return answer;
    }
}