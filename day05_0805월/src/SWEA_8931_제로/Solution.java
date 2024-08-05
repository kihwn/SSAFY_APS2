package SWEA_8931_제로;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    static ArrayList<Integer>nums;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int round=1; round<=t; round++){
            int k = sc.nextInt();
            nums = new ArrayList<>();
            for (int i=0; i<k; i++){
                int tmp = sc.nextInt();
                if (tmp!=0){
                    push(tmp);
                }
                else{
                    pop();
                }
            }

            int size = nums.size();
            int sum = 0;
            for (int i=0; i<size; i++){
                sum+= pop();
            }

            System.out.println("#"+round+" "+sum);


        }

    }

    public static void push(int x){
        nums.add(x);
    }

    public static int pop(){
        if (!nums.isEmpty()){
            int tmp = nums.get(nums.size()-1);
            nums.remove(nums.size()-1);
            return tmp;
        }
        return -1;
    }

    public static boolean isEmpty(){
        if (nums.isEmpty()){
            return true;
        }
        return false;
    }

    public static int peek(){
        return nums.get(nums.size()-1);
    }

}