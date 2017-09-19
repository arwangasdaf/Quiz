/*
小易老师是非常严厉的,它会要求所有学生在进入教室前都排成一列,并且他要求学生按照身高不递减的顺序排列。有一次,n个学生在列队的时候,小易老师正好去卫生间了。学生们终于有机会反击了,于是学生们决定来一次疯狂的队列,他们定义一个队列的疯狂值为每对相邻排列学生身高差的绝对值总和。由于按照身高顺序排列的队列的疯狂值是最小的,他们当然决定按照疯狂值最大的顺序来进行列队。现在给出n个学生的身高,请计算出这些学生列队的最大可能的疯狂值。小易老师回来一定会气得半死。 
输入描述:
输入包括两行,第一行一个整数n(1 ≤ n ≤ 50),表示学生的人数
第二行为n个整数h[i](1 ≤ h[i] ≤ 1000),表示每个学生的身高


输出描述:
输出一个整数,表示n个学生列队可以获得的最大的疯狂值。

如样例所示: 
当队列排列顺序是: 25-10-40-5-25, 身高差绝对值的总和为15+30+35+20=100。
这是最大的疯狂值了。

输入例子1:
5
5 10 25 40 25

输出例子1:
100
*/


/*
解题思路：先对数列排序，然后每次取数列中最大和最小的数，然后用最大和最小的数和剩下数列中的最大和最小的数作差
但可能会存在奇数和偶数的问题
*/


import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int num = cin.nextInt();
		//data
		int[] den = new int[num];
		for (int i=0 ; i<num ; i++) {
			den[i] = cin.nextInt();
		}
		// nlogn  O(n)
		Arrays.sort(den);
		//  two peak
		int maxd = den[num-1];
		int mind = den[0];
		// diff ->  max -min
		int diff = max - min;
        //  two index
        int maxindex = num - 1;
        int minindex = 1;
        // Loop
        while(minindex < maxindex){
        	diff += maxd - den[minindex];
        	diff += den[maxindex] - mind;
        	minindex++;
        	maxindex--;
        }
        // odd or even
        diff += Math.max()

	}
}