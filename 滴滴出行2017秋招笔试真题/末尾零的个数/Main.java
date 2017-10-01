/*
时间限制：1秒
空间限制：32768K
输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2 
输入描述:
输入为一行，n(1 ≤ n ≤ 1000)


输出描述:
输出一个整数,即题目所求

输入例子1:
10

输出例子1:
2
*/

/*
解题思路：求小于这个数的数里面有多少个数是5的倍数
*/

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            int  n = sc.nextInt();
            int res = 0;
            for(int i=n ; i>=5 ; i--){
            	int temp = i;
            	while(temp % 5 ==0){
            		res++;
            		temp /= 5;
            	}
            }
            // out the number of 0
            System.out.println(res);
        }
    }
}