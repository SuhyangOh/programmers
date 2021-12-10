package 괄호_변환;
public class Solution {
    public static String solution(String p) {
        if (p.equals("")) {
            return "";
        }
        String u = "";
        String v = "";
        int left = 0;
        int right = 0;
        boolean isBalanced = true;
        for (int i = 0; i < p.length(); i++) {
            String s = p.substring(i, i + 1);
            if (s.equals("(")) {
                left++;
            } else {
                right++;
            }
            u += s;
            if (right > left) {
                isBalanced = false;
            }
            if (left == right) {
                v = p.substring(i + 1);
                break;
            }
        }
        if (isBalanced) {
            return u + solution(v);
        } else {
            v = "(" + solution(v) + ")";
            for (int i = 1; i < u.length() - 1; i++) {
                String s = p.substring(i, i + 1);
                if (s.equals("(")) {
                    v += ")";
                } else {
                    v += "(";
                }
            }
        }
        return v;
    }
    public static void main(String[] args) {
        solution("()))((()");
    }
}