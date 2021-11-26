package Generating_Prime_Number;
import java.util.*;
public class Solution {
    boolean isPrime(int n) {
        Double middle = Math.sqrt(n);
        for (int i = 2; i < middle + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length -1; j++) {
                for (int m = j + 1; m < nums.length; m++) {
                    sums.add(nums[i] + nums[j] + nums[m]);
                }
            }
        }
        for (int sum : sums) {
            if (isPrime(sum)) {
                answer++;
            }
        }

        return answer;
    }
}