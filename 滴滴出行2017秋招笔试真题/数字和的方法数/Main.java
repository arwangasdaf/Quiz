/*
时间限制：1秒
空间限制：32768K
给定一个有n个正整数的数组A和一个整数sum,求选择数组A中部分数字和为sum的方案数。
当两种选取方案有一个数字的下标不一样,我们就认为是不同的组成方案。 
输入描述:
输入为两行:
 第一行为两个正整数n(1 ≤ n ≤ 1000)，sum(1 ≤ sum ≤ 1000)
 第二行为n个正整数A[i](32位整数)，以空格隔开。


输出描述:
输出所求的方案数

输入例子1:
5 15 5 5 10 2 3

输出例子1:
4
*/

/*
解题思路：动态规划可解
*/

//用dp[i][j]表示前i个数组成和为j的情况的总数的个数

import java.util.*;
public class Main{
	public static long[][] dp = new long[1000][1000];
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            int m = sc.nextInt();
            int sum = sc.nextInt();
            int[] data = new int[1000];
            //input
            for (int i=1 ; i<=m ; i++) {
            	data[i] = sc.nextInt();
            }
            //当i=0的时候也就是前0个数组成j的情况，此时dp为0
            for (int i=1 ; i<sum ; i++) {
            	dp[0][i] = 0; 
            }
            //当j=0的时候也就是前n个数组成和为0的情况，此时只有一种那就是什么都不取
            for (int i=0 ; i<m ; i++) {
            	dp[i][0] = 1;
            }
            //
            for (int i=1 ; i<=m ; i++) {
            	for (int j = 0; j<=sum ; j++) {
            		if (data[i] <= j) {
            			dp[i][j] = dp[i-1][j] + dp[i-1][j-data[i]];
            		}else{
            			dp[i][j] = dp[i-1][j];
            		}
            	}
            }
            System.out.println(dp[m][sum]);
        }
    }
}