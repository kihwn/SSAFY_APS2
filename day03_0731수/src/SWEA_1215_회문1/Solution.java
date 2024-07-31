package SWEA_1215_회문1;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        for (int p=0;  p<10; p++){
            int n = sc.nextInt();
            sc.nextLine();
            String[][]map = new String[8][8];

            for (int i=0; i<8; i++){
                String s = sc.nextLine();
                String[]sarr = s.split("");
                for (int j=0; j<8; j++){
                    map[i][j]=sarr[j];
                }
            }

            for (int i=0; i<8; i++){}


        }
    }
}