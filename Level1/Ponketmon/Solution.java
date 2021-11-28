package Ponketmon;
import java.util.*;
public class Solution {
    public static int solution(int[] nums) {
        int answer = 1;
        Arrays.sort(nums);
        int n = nums[0];
        for (int num : nums) {
            if (n != num) {
                answer++;
            }
            n = num;
        }
        return Math.min(answer, nums.length / 2);
    }
}