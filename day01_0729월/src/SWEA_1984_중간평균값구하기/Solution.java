package SWEA_1984_중간평균값구하기;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++){
            String s = sc.nextLine();
            String[]sarr = s.split(" ");
            int[]arr = new int[10];
            for (int j=0; j<10;j++){
                arr[j]=Integer.parseInt(sarr[j]);
            }

            Arrays.sort(arr);
            int print = i+1;
            double sum = 0;
            for (int j=1; j<9; j++){
                sum+=arr[j];
            }
            sum = sum/8;
            int printNum = (int)Math.round(sum);

            System.out.println("#"+print+" "+printNum);


        }
    }
}
