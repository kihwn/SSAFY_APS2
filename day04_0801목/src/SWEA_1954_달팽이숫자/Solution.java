package SWEA_1954_달팽이숫자;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int round= 1; round <= t; round++) {
            int n = sc.nextInt();
            sc.nextLine();
            int[][] map = new int[n][n];

            
            int[] dx = {0, 1, 0, -1};
            int[] dy = {1, 0, -1, 0};

            int x = 0;
            int y = 0;
            int d = 0;
            int cnt = 1;

            while (cnt <= n * n) {
                map[x][y] = cnt++;
                int nx = x + dx[d];
                int ny = y + dy[d];

                
                if (nx < 0 || ny < 0 || nx >= n || ny >= n|| map[nx][ny] != 0) {
                    d = (d + 1) % 4;
                    nx = x + dx[d];
                    ny = y + dy[d];
                }

                x = nx;
                y = ny;
            }

            // 결과 출력
            System.out.println("#" + round);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        }

        
    }
}
