/*
小易有一个长度为n的整数序列,a_1,...,a_n。然后考虑在一个空序列b上进行n次以下操作:
1、将a_i放入b序列的末尾
2、逆置b序列
小易需要你计算输出操作n次之后的b序列。 
输入描述:
输入包括两行,第一行包括一个整数n(2 ≤ n ≤ 2*10^5),即序列的长度。
第二行包括n个整数a_i(1 ≤ a_i ≤ 10^9),即序列a中的每个整数,以空格分割。


输出描述:
在一行中输出操作n次之后的b序列,以空格分割,行末无空格。

输入例子1:
4
1 2 3 4

输出例子1:
4 2 1 3
*/

/*
解法：利用Java的Collections的API进行计算，但时间复杂度过大
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

		// List
		List<Integer> res = new ArrayList<Integer>();
		// Loop
		for (int i=0 ; i<num ; i++) {
			res.add(den[i]);
			Collections.reverse(res);
		}

		// output
		/*for (Integer e : res) {
			System.out.print(e+" ");
		}*/

		for (int i=0 ; i<res.size() ; i++) {
			if(i == res.size() -1){
				System.out.print(res.get(i));
			}else{
                System.out.print(res.get(i)+" ");
			}
		}
	}
}