package The_Highest_and_Lowest_Lotto_Prizes;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int a = 7;
        int b = 7;
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                b--;
            } else {
                for (int j = 0; j < 6; j++) {
                    if (lottos[i] == win_nums[j]) {
                        a--;
                        b--;
                        break;
                    }
                }

            }
        }
        if (a == 7) {
            a = 6;
        }
        if (b == 7) {
            b = 6;
        }
        return new int[]{b, a};
    }
}