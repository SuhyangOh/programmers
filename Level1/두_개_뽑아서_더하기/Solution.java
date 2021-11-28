package 두_개_뽑아서_더하기;
import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!arr.contains(numbers[i] + numbers[j])) {
                    arr.add(numbers[i] + numbers[j]);
                }
            }
        }
        int[] answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}