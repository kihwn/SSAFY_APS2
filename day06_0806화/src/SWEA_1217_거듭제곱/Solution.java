package SWEA_1217_거듭제곱;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=10; i++){
            int grb = sc.nextInt(); //필요없는 값 (garbage)
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println("#"+i+" "+multiple(n,m));
        }
    }

    public static int multiple(int n, int m){
        if (m==0){
            return 1;
        }

        return n * multiple(n, m-1);
    }

}