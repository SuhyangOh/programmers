package 오픈채팅방;
import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> ans_array = new ArrayList<>();
        HashMap<String, String> names = new HashMap<>();
        for (String r : record) {
            String[] rec = r.split(" ");
            if (rec.length == 3) {
                names.put(rec[1], rec[2]);
            }
        }
        for (int i = 0; i < record.length; i++) {
            String r = record[i];
            String[] rec = r.split(" ");
            String s = "";
            if(rec[0].equals("Change")) {
                continue;
            }
            s += names.get(rec[1]);
            s += "님이 ";
            if (rec[0].equals("Enter")) {
                s+= "들어왔습니다.";
            } else if (rec[0].equals("Leave")) {
                s+= "나갔습니다.";
            }
            ans_array.add(s);
        }
        String[] answer = ans_array.toArray(new String[0]);

        return answer;
    }
}