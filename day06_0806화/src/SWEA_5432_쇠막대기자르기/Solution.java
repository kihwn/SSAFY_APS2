package SWEA_5432_쇠막대기자르기;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    static ArrayList<String> arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int round=1; round<=t; round++){
            String s = sc.next();
            String[]sarr = s.split("");
            arr = new ArrayList<>();
            int sum =0;

            int n = sarr.length;
            for (int i=0; i<n; i++){
                if (sarr[i].equals("(")){

                    push(sarr[i]);
                }
                else{
                    pop();

                    if (sarr[i-1].equals("(")){
                        sum+=arr.size();
                    }
                    else{
                        sum++;
                    }
                }
            }

            System.out.println("#"+round+" "+sum);
        }


    }

    public static void push(String x){
        arr.add(x);
    }

    public static String pop(){
        if (!arr.isEmpty()){
            String tmp = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            return tmp;
        }
        return null;
    }

    public static boolean isEmpty(){
        if (arr.isEmpty()){
            return true;
        }
        return false;
    }

    public static String peek(){
        if (!isEmpty()){
            return arr.get(arr.size()-1);}
        else{
            return null;
        }
    }

}