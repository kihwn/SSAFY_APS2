package SWEA_3499_퍼펙트셔플;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //테스트 케이스 입력 받기
        int t = sc.nextInt();
        for (int round=1; round<=t; round++){
            int size = sc.nextInt();
            //이후 정답 목록을 묶어서 출력하기 위해 StringBuilder 생성
            StringBuilder sb = new StringBuilder();
            //앞부분 값 입력 받을 큐
            Queue<String> queue1 = new LinkedList<>();
            //뒷부분 값 입력 받을 큐
            Queue<String>queue2 = new LinkedList<>();

           //입력받을 값의 크기가 짝수일 경우 절반씩 나누어 queue1과 queue2에 입력받기
            if (size%2==0){
                for (int i=0; i<size/2; i++){
                    queue1.add(sc.next());
                }
                for (int i=size/2; i<size; i++){
                    queue2.add(sc.next());
                }

            }
            //홀수인 경우 queue1에 절반+1을 입력받고, 나머지를 queue2에 입력받기
            else{
                for (int i=0; i<=size/2; i++){
                    queue1.add(sc.next());
                }
                for (int i=size/2+1; i<size; i++){
                    queue2.add(sc.next());
                }
            }


            //0~size-1까지 돌면서, 해당 횟수가 짝수일 경우 queue1에서 뽑아내고,
            //해당 횟수가 홀수일 경우 queue2에서 뽑아내기.
            for (int i=0; i<size; i++){
                if(i%2==0){
                    sb.append(queue1.poll());
                    sb.append(" ");
                }
                else{
                    sb.append(queue2.poll());
                    sb.append(" ");
                }
            }

            System.out.println("#"+round+" "+sb);

        }
    }

}