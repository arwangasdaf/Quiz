/*
大富翁游戏，玩家根据骰子的点数决定走的步数，即骰子点数为1时可以走一步，点数为2时可以走两步，点数为n时可以走n步。求玩家走到第n步（n<=骰子最大点数且是方法的唯一入参）时，总共有多少种投骰子的方法。 
输入描述:
输入包括一个整数n,(1 ≤ n ≤ 6)


输出描述:
输出一个整数,表示投骰子的方法

输入例子1:
6

输出例子1:
32
*/

/*
这里规定了n的大小为n<=6，所以可以用类似递归的方法来找规律
f(n) = f(n-1) + f(n-2) + ... + f(1)
f(n-1) = f(n-2) + f(n-3) + ... + f(1)

f(n) = f(n-1) * 2
f(n) = 2 ^ (n-1)

*/
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
        System.out.println((int)Math.pow(2 , n-1));		
	}
} 