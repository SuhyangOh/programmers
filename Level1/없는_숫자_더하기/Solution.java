package 없는_숫자_더하기;

public class Solution {
    public int solution(int[] numbers) {
        String nums = "123456789";
        for(int i = 0; i < numbers.length; i++) {
            nums = nums.replace(Integer.toString(numbers[i]), "");
        }
        int a = Integer.parseInt(nums);
        int answer = 0;
        for (int i = 0; i < nums.length(); i++) {
            answer += a % 10;
            a /= 10;
        }
        return answer;

        // 다른 풀이
//        int sum = 45;
//        for (int i : numbers) {
//            sum -= i;
//        }
//        return sum;
    }
}