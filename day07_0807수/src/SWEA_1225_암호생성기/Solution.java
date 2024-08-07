package SWEA_1225_암호생성기;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //테스트케이스(round)는 10번 반복
        for (int round=1; round<=10; round++){
            //각 테스트케이스마다 암호 세트를 출력하기 위해 Stringbuilder 생성.
            StringBuilder sb =  new StringBuilder();
            //테스트케이스 순서 필요 X.
            sc.nextInt();
            // 암호값 업데이트를 FIFO 형태로 해야하기 때문에 Queue 사용.
            Queue<Integer> queue = new LinkedList<>();

            //8자리의 암호값 입력받기
            for (int i=0; i<8; i++){
                queue.add(sc.nextInt());
            }

            // tmp: head가 가리키고 있을 idx인데 while문 조건을 돌리기 위해 1로 초기화
            //minus : 매사이클마다 1~5의 값을 순서대로 빼주기 위해 업데이트할 빼줄 값.
            int tmp=1;
            int minus =1;
            //업데이트한 암호 값이 0을 넘는 동안 반복하는 while문 생성.
            //queue의 헤드가 가리키는, 암호값을 뽑아내주고,
            //해당 값에 minus 값만큼 빼줌.
            //다음에 minus값만큼 빼주기 위해 minus++를 해주고,
            //만일 minus가 한 사이클인 1~5사이의 값을 초과한다면
            //해당 minus값에서 5를 빼줌.
            //업데이트한 암호 값이 0이하이면 해당 값을 0으로 바꿔주고, 암호묶음인 queue에 add.
            //또한 업데이트 암호값이 0일 경우 반복문 종료.
            while(tmp>0){
                tmp = queue.poll();
                tmp = tmp-minus;
                minus++;
                if (minus>5){
                    minus-=5;
                }
                if (tmp<0){
                    tmp=0;
                }
                queue.add(tmp);
            }

            //queue에 저장된 최종 암호 값을 출력을 위해 Stringbuilder로 만들어줌.
            while(!queue.isEmpty()){
                sb.append(queue.poll());
                sb.append(" ");
            }

            System.out.println("#"+round+" "+sb);

        }

    }
}