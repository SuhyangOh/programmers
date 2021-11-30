package 다트_게임;
public class Solution {
    public static int solution(String dartResult) {
        int answer = 0;
        int i = 0;
        int[] results = new int[]{0, 0};
        while (i < dartResult.length()) {
            results[1] = Integer.parseInt(dartResult.substring(i, i+ 1));
            i++;
            String power = dartResult.substring(i, i+ 1);
            if (power.equals("0")) {
                results[1] = 10;
                i++;
                power = dartResult.substring(i, i+ 1);
            }
            if (power.equals("D")) {
                results[1] *= results[1];
            } else if (power.equals("T")) {
                results[1] *= results[1] * results[1];
            }
            i++;
            if (i < dartResult.length()) {
                String option = dartResult.substring(i, i+ 1);
                if (option.equals("*")) {
                    results[0] *= 2;
                    results[1] *= 2;
                    i++;
                } else if (option.equals("#")) {
                    results[1] *= -1;
                    i++;
                }
            }
            answer += results[0];
            results[0] = results[1];
        }
        answer += results[0];
        return answer;
    }
}