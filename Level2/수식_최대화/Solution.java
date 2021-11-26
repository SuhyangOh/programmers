package 수식_최대화;
import java.util.*;
public class Solution {
    static long cal(long x, long y, String exp) {
        if (exp.equals("+")) {
            return x + y;
        } else if (exp.equals("*")) {
            return x * y;
        }
        return x - y;
    }
    public static long solution(String expression) {
        ArrayList<String> mathS = new ArrayList<>();
        ArrayList<Long> numberS = new ArrayList<>();
        int number = 0;
        for (int i = 0; i < expression.length(); i++) {

            if (Character.isDigit(expression.charAt(i))) {
                number *= 10;
                number += Integer.parseInt(expression.substring(i, i+1));
                if (i == expression.length() - 1) {
                    numberS.add(Long.valueOf(number));
                }
            } else {
                mathS.add(expression.substring(i, i+1));
                numberS.add(Long.valueOf(number));
                number = 0;
            }
        }

        String[][] priority = {{"*", "+", "-"}, {"*", "-", "+"}, {"+", "*", "-"}, {"+", "-", "*"}, {"-", "*", "+"}, {"-", "+", "*"}};
        long answer = -1000000000;
        for (int i = 0; i < 6; i++) {
            String[] p = priority[i];
            long newnum = 0;
            ArrayList<String> math = new ArrayList<>(mathS);
            ArrayList<Long> numbers = new ArrayList<>(numberS);
            for (int x = 0; x < 3; x++) {
                for (int j = 0; j < math.size(); j++) {
                    if (p[x].equals(math.get(j))) {
                        newnum = cal(numbers.get(j), numbers.get(j + 1), math.get(j));
                        numbers.set(j, newnum);
                        numbers.remove(j + 1);
                        math.remove(j);
                        j -= 1;
                    }
                }
            }
            System.out.println(newnum);
            if (Math.abs(newnum) > answer) {
                answer = Math.abs(newnum);
            }
        }

        return answer;
    }
}