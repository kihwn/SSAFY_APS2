package SWEA_2068_최대수구하기;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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

            System.out.println("#"+print+" "+arr[9]);

        }
    }
}
