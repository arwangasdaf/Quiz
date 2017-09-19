/*
时间限制：1秒
空间限制：32768K
给定一组非负整数组成的数组h，代表一组柱状图的高度，其中每个柱子的宽度都为1。 在这组柱状图中找到能组成的最大矩形的面积（如图所示）。 入参h为一个整型数组，代表每个柱子的高度，返回面积的值。


输入描述:
输入包括两行,第一行包含一个整数n(1 ≤ n ≤ 10000)
第二行包括n个整数,表示h数组中的每个值,h_i(1 ≤ h_i ≤ 1,000,000)


输出描述:
输出一个整数,表示最大的矩阵面积。
梓醇
输入例子1:
6
2 1 5 6 2 3

输出例子1:
10
*/

import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static int calculate(int[] a , int n){
        int ans =0;
        for (int i=0 ; i<n ; i++) {
            int h = a[i];
            for (int j=i ; j<n ; j++) {
                if (a[j] < h) h = a[j];
                int s = (j - i + 1) * h;
                if (ans < s) ans = s;
            }
        }
        return ans;
    }


    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] a = new int[n];
            for (int i=0 ; i<n ; i++) {
                a[i] = sc.nextInt();
            }
            int res = calculate(a , n);
            System.out.println(res);
        }
    }
}