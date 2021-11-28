package 카카오프렌즈_컬러링북;

public class Solution {
    static int[][] pic;

    static int erase(int x, int y, int color) {
        int m = pic.length;
        int n = pic[0].length;
        int erased = 0;
        pic[x][y] = 0;
        if (x - 1 >= 0 && pic[x - 1][y] == color) {
            erased++;
            erased += erase(x - 1, y, color);
        }
        if (x + 1 < m && pic[x + 1][y] == color) {
            erased++;
            erased += erase(x + 1, y, color);
        }
        if (y - 1 >= 0 && pic[x][y - 1] == color) {
            erased++;
            erased += erase(x, y - 1, color);
        }
        if (y + 1 < n && pic[x][y + 1] == color) {
            erased++;
            erased += erase(x, y + 1, color);
        }

        return erased;
    }
    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        pic = new int[m][n];
        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                pic[i][j] = picture[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int size = 0;
                if (pic[i][j] != 0) {
                    size = 1 + erase(i, j, pic[i][j]);
                    numberOfArea++;
                    if (size > maxSizeOfOneArea) {
                        maxSizeOfOneArea = size;
                    }
                }
            }
        }
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
}