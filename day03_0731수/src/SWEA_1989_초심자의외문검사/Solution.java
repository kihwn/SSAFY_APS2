package SWEA_1989_초심자의외문검사;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++){
            String s = sc.nextLine();
            String[]sarr = s.split("");
            int size = sarr.length;
            boolean check = true;
            for (int j=0; j<size/2; j++){
                if (!sarr[j].equals(sarr[size-1-j])){
                    check = false;
                    break;
                }
            }

            int round = i+1;

            if (check){
                System.out.println("#"+round+" 1");
            }
            else{
                System.out.println("#"+round+" 0");
            }
        }


    }

}