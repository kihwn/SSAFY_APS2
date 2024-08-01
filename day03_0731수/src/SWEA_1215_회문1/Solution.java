package SWEA_1215_회문1;

import java.util.Scanner;

public class Solution {
    static String[][]map = new String[8][8];
    static Scanner sc = new Scanner(System.in);
    static int cnt = 0;
    public static void main(String[] args) {

        for (int round=0; round<10; round++){
            cnt =0;
            int find = sc.nextInt();
            sc.nextLine();

            makeMap();
            checkRow(find);
            checkCol(find);

            int printRound = round+1;
            System.out.println("#"+printRound+" "+cnt);

        }
    }

    public static void makeMap(){
        for (int i=0; i<8; i++){
            String s = sc.nextLine();
            String[]sarr = s.split("");
            for (int j=0; j<8; j++){
                map[i][j]=sarr[j];
            }
        }
    }

    public static boolean checkPalin1(int i,int j, int size){

        int round = size/2;
        boolean check = true;

        for (int z=0; z<round; z++){

            if (!map[i][j+z].equals(map[i][j+size-1-z])){
                check = false;
                break;
            }
        }
        return check;
    }

    public static boolean checkPalin2(int i,int j, int size){

        int round = size/2;
        boolean check = true;

        for (int z=0; z<round; z++){
            if (!map[i+z][j].equals(map[size-1+i-z][j])){
                check = false;
                break;
            }
        }
        return check;
    }

    public static void checkRow(int find){
        for (int i=0; i<=8-find; i++){
            for (int j=0; j<8; j++){
                boolean check = checkPalin2(i,j,find);
                if(check){
                    cnt++;
                }
            }
        }
    }

    public static void checkCol(int find){
        for (int i=0; i<8; i++){
            for (int j=0; j<=8-find; j++){
                boolean check = checkPalin1(i,j,find);
                if(check){
                    cnt++;
                }
            }
        }
    }

}