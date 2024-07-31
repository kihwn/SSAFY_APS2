package SWEA_1213_String;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int p=0; p<10; p++){
            int testCase = sc.nextInt();
            sc.nextLine();
            String find = sc.nextLine();

            String s = sc.nextLine();

            int sum =0;
            int slen = s.length();
            int findlen = find.length();

            for (int i=0; i<=slen-findlen; i++){
                String tmp = s.substring(i,i+findlen);
                if (tmp.equals(find)){
                    sum++;
                }
            }
            System.out.println("#"+testCase+" "+sum);
        }







    }
}