package SWEA_1208_flatten;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int round =1; round<=10; round++){
            int dump = sc.nextInt();
            int[]arr = new int[100];
            for (int i=0; i<100; i++){
                arr[i]=sc.nextInt();
            }

            int[]sortArr = countingSort(arr);

            for (int i=0; i<dump; i++){
                if (sortArr[99]-sortArr[0]<=1){
                    break;
                }

                sortArr[99]--;
                sortArr[0]++;
                sortArr = countingSort(sortArr);
            }
            int result = sortArr[99]-sortArr[0];


            System.out.println("#"+round+" "+result);


        }



    }

    public static int[]countingSort(int[]arr){
        int[]counting=new int[100];
        int[]finalArr=new int[100];
        for (int i=0; i<100; i++){
            int tmp = arr[i];
            counting[tmp-1]++;
        }

        for (int i=0; i<99; i++){
            counting[i+1]=counting[i]+counting[i+1];
        }

        for (int i=99; i>=0; i--){
            finalArr[counting[arr[i]-1]-1]=arr[i];
            counting[arr[i]-1]--;
        }

        return finalArr;
    }
}
