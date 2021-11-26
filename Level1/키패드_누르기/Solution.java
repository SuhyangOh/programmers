package 키패드_누르기;

public class Solution {
    String answer = "";
    int Lcurrent = 10;
    int Rcurrent = 12;
    void click(String hand, int next) {
        if (hand.equals("left")) {
            answer += "L";
            Lcurrent = next;
        } else if (hand.equals("right")) {
            answer += "R";
            Rcurrent = next;
        }
    }
    int distance(int start, int dest) {
        int d = (dest + 1) / 3;     // 2, 5, 8, 11(0) => 1, 2, 3, 4
        int s;
        int distance;
        // vertical distance + horizontal distance (= 1)
        if (start % 3  == 1) {
            s = (start + 2) / 3;    // 1, 4, 7, 10(*) => 1, 2, 3, 4
            distance = Math.abs(d - s) + 1;
        } else if (start % 3  == 0) {
            s = (start) / 3;    // 3, 6, 9, 12(#) => 1, 2, 3, 4
            distance = Math.abs(d - s) + 1;
        } else {
            // horizontal distance = 0 (start = 2,5,8,0)
            s = (start + 1) / 3;
            distance = Math.abs(d - s);
        }
        return distance;

    }
    public String solution(int[] numbers, String hand) {
        for (int i = 0; i < numbers.length; i++) {
            int next = numbers[i];
            if (next == 0) {
                next= 11;
            }
            if (next % 3 == 1) {
                click("left", next);
            }else if (next % 3 == 0 ) {
                click("right", next);
            }
            else {
                int Ldis = distance(Lcurrent, next);
                int Rdis = distance(Rcurrent, next);
                if (Rdis > Ldis) {
                    click("left", next);
                } else if (Rdis < Ldis){
                    click("right", next);
                } else {
                    click(hand, next);
                }
            }
        }
        return answer;
    }
}