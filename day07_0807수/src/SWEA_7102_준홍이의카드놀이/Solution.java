package SWEA_7102_준홍이의카드놀이;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //테스트케이스 수 입력받기
        int t = sc.nextInt();

        for (int round=1; round<=t; round++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            //1+1부터 n+m사이 값인 합의 개수를 넣을 배열. 0과 1의 값은 포함하지 않지만, 편의를 위해 n+m+1크기로 생성
            int[]sums = new int[n+m+1];

            //n개의 카드 중 하나, m개의 카드 중 하나를 뽑아 합을 구하고, 해당 합을 idx로 하는 배열의 값을 늘려줌.
            for (int i=1; i<=n; i++){
                for (int j=1; j<=m; j++){
                    int sum = i+j;
                    sums[sum]++;
                }
            }

            //빈도수가 가장 높은 합의 값들을 모아둘 ArrayList 생성(크기가 아직 정해지지않음)
            ArrayList<Integer>max_idxs = new ArrayList<>();

            //최대 빈도수를 찾기 위한 값
            int max = 0;

            for (int i=2; i<=n+m; i++){
                //최댓값보다 현재 바라보는 값의 빈도수가 더 높으면
                //최댓값을 해당 빈도수로 업데이트하고,
                //혹시 이전에 빈도수가 높은 합의 값들을 모아둔 arrayList가 이미 채워져 있을 수 있기 때문에
                //clear를 한 번 하고, 새로이 해당 합을 ArrayList에 넣어 줌.
                if (max<sums[i]){
                    max = sums[i];
                    max_idxs.clear();
                    max_idxs.add(i);
                }
                //만일 현재 최대 빈도수와 같은 빈도수가 나온다면 해당 빈도수를 갖는 합의 값을 정답을 위해 모아둔 ArrayList에 추가해 줌 .
                else if (max == sums[i]){
                    max_idxs.add(i);
                }
            }

            //정답 목록인 ArrayList에 있는 값을 출력하기 위해 StringBuilder 생성.
            StringBuilder sb= new StringBuilder();

            //정답 목록의 개수만큼 StringBuilder를 엮어서 만들기.
            for (int i=0; i<max_idxs.size(); i++){
                sb.append(max_idxs.get(i));
                sb.append(" ");
            }

            System.out.println("#"+round+" "+sb);


        }



    }
}