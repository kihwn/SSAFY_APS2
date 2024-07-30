package SWEA_1209_Sum;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int p=0; p<10; p++){
            int testCase = sc.nextInt();
            sc.nextLine();
            int[][]map = new int[100][100];
            int[]sums = new int[202];

            for (int i=0; i<100; i++){
                String s = sc.nextLine();
                String[]sarr = s.split(" ");
                for (int j=0; j<100; j++){
                    map[i][j]=Integer.parseInt(sarr[j]);
                }
            }

            for (int i=0; i<100; i++){
                //세로 더하기
                int sum = 0;
                for (int j=0; j<100; j++){
                    sum+=map[i][j];
                }
                sums[i]=sum;

            }

            //가로 더하기
            for (int i=0; i<100; i++){
                int sum =0;
                for (int j=0; j<100; j++){
                    sum+=map[j][i];
                }
                int idx = 100+i;
                sums[idx]=sum;
            }

            int sum1 =0;

            for (int i=0; i<100; i++){
                sum1+=map[i][i];
            }

            sums[200]=sum1;

            //5,0 4,1
            int sum2=0;
            for (int i=0; i<100; i++){
                sum2+=map[i][99-i];
            }
            sums[201]=sum2;

            Arrays.sort(sums);
            int max = sums[201];
            System.out.println("#"+testCase+" "+max);




        }
    }

}