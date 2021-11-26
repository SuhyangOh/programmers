package 완주하지_못한_선수;
import java.util.*;
class Solution {
    public static String solution(String[] participant, String[] completion) {
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//        int i = 0;
//        while( i < completion.length) {
//            if (!participant[i].equals(completion[i])) {
//                return participant[i];
//            }
//            i++;
//        }
//        return participant[i];
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String p : participant) {
            hm.put(p, hm.getOrDefault(p, 0) + 1);
//            if (hm.containsKey(p)) {
//                hm.put(p, hm.get(p) + 1);
//            } else {
//                hm.put(p, 1);
//            }
        }
        for (String c : completion) {
            hm.put(c, hm.get(c) - 1);
        }
        for (String r : hm.keySet()) {
            if(hm.get(r) != 0) {
                answer = r;
            }
        }
        return answer;
    }
}