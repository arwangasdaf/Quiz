/*
求最长公共子序列
*/
import java.util.Scanner;
import java.util.Arrays;
public class Main1{
    public static int lcs(String a , String b){
        int x = a.length();
        int y = b.length();
        int[][] dp = new int[x+1][y+1];
        for (int  i=1 ; i<=x ; i++) {
            for (int j=1 ; j<=y ; j++) {
                if (a.charAt(i-1) == b.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i][j-1] , dp[i-1][j]);
                }
            }
        }
        return dp[x][y];
    }


    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            String line1 = sc.next();
            String line2 = sc.next();
            int res = lcs(line1 , line2);
            System.out.println(res);
        }
    }
}