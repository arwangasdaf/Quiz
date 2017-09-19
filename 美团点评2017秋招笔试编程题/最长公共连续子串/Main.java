/*
给出两个字符串（可能包含空格）,找出其中最长的公共连续子串,输出其长度。
输入描述:
输入为两行字符串（可能包含空格），长度均小于等于50.


输出描述:
输出为一个整数，表示最长公共连续子串的长度。

输入例子1:
abcde
abgde

输出例子1:
2
*/

import java.util.*;
public class Main{
    public static int lcs(String a , String b){
        int x = a.length();
        int y = b.length();
        int[][] dp = new int[x][y];
        int res = 0;
        for (int  i=0 ; i<x ; i++) {
            for (int j=0 ; j<y ; j++) {
                if (a.charAt(i) == b.charAt(j)){
                   if (i==0 || j==0) {
                       dp[i][j] = 1;
                   }else{
                       dp[i][j] = dp[i-1][j-1] + 1;
                   }
                   res = Math.max(res , dp[i][j]);
                } 
            }
        }
        return res;
    }


    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            String line1 = sc.nextLine();  //nextLine用于接收一个字符串
            String line2 = sc.nextLine();
            int res = lcs(line1 , line2);
            System.out.println(res);
        }
    }
}