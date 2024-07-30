package SWEA_1206_View;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<10; i++){
            int size = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            String[]sarr = s.split(" ");

            int[]nums = new int[size];
            for (int j=0; j<size; j++){
                nums[j]=Integer.parseInt(sarr[j]);
            }
            int sum = 0;

            for (int j=2; j<size-2; j++){
                int max =0;
                if (nums[j-2]>max){
                    max = nums[j-2];
                }

                if(nums[j-1]>max){
                    max= nums[j-1];
                }

                if (nums[j+1]>max){
                    max = nums[j+1];
                }

                if (nums[j+2]>max){
                    max = nums[j+2];
                }
                int tmp = 0;

                if (nums[j]>max){
                    tmp = nums[j]-max;
                }
                sum+=tmp;
            }

            int print = i+1;

            System.out.println("#"+print+" "+sum);


        }
    }
}
