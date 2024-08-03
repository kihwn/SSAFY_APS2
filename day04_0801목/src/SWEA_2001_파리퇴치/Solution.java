package SWEA_2001_파리퇴치;

public class Solution {
   static int[][]map;
    static int n;
    static int m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int round=1; round<=t; round++){
            String k = sc.nextLine();
            String[]karr = k.split(" ");
            n = Integer.parseInt(karr[0]);
            m = Integer.parseInt(karr[1]);
            map = new int[n][n];
            int max = 0;

            for (int i=0; i<n; i++){
                String s = sc.nextLine();
                String[]sarr = s.split(" ");
                for (int j=0; j<n; j++){
                    map[i][j]=Integer.parseInt(sarr[j]);
                }
            }

            for (int i=0; i<=n-m; i++){
                for (int j=0; j<=n-m; j++){
                    int temp = makeSum(i,j);
                    max = Math.max(temp,max);
                }
            }

            System.out.println("#"+round+" "+max);



        }
    }

    public static int makeSum(int i,int j){
        int sum = 0;

        for (int x=0; x<m; x++){
            for (int y=0; y<m; y++){
                sum+=map[i+x][j+y];
            }
        }
        return sum;
    }

}
