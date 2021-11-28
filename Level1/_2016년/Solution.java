package _2016년;

public class Solution {
    public String solution(int a, int b) {
        String[] days = new String[]{"THU","FRI","SAT", "SUN","MON","TUE","WED"};
        for (int i = 1; i < a; i++) {
            System.out.println(b);
            if (i == 2) {
                b += 29;
            } else if ((i <= 7 && i % 2 == 1) ||(i > 7 && i % 2 == 0)) {
                b += 31;
            } else {
                b += 30;
            }
        }
        System.out.println(b);
        return days[b % 7];
    }
}