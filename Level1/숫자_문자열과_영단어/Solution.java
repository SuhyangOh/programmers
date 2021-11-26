package 숫자_문자열과_영단어;

class Solution {
    int StoN(String num) {
        if (num.equals( "zero")) {
            return 0;
        }
        if (num.equals("one")) {
            return 1;
        }
        if (num.equals("two")) {
            return 2;
        }
        if (num.equals("three")) {
            return 3;
        }
        if (num.equals("four") ){
            return 4;
        }
        if (num.equals("five")) {
            return 5;
        }
        if (num.equals("six") ){
            return 6;
        }
        if (num.equals("seven")) {
            return 7;
        }
        if (num.equals("eight")){
            return 8;
        }
        if (num.equals("nine")){
            return 9;
        }
        return -1;
    }

    public int solution(String s) {
        // StoN을 활용한 풀이1
//        int answer = 0;
//        String number="";
//        for (int i =0; i < s.length(); i++) {
//            if (Character.isDigit(s.charAt(i)))   {
//                answer*= 10;
//                answer += Integer.parseInt(s.substring(i, i+1));
//            } else {
//                number += s.substring(i, i+1);
//                if (StoN(number) >=0) {
//                    answer*= 10;
//                    answer += StoN(number);
//                    number="";
//                }
//            }
//        }
//        return answer;
//
        // replaceAll을 활용한 풀이2
        String[] alphs = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(alphs[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}