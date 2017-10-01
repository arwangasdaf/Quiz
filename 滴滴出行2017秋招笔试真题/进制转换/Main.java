/*
时间限制：1秒
空间限制：32768K
给定一个十进制数M，以及需要转换的进制数N。将十进制数M转化为N进制数 
输入描述:
输入为一行，M(32位整数)、N(2 ≤ N ≤ 16)，以空格隔开。


输出描述:
为每个测试实例输出转换后的数，每个输出占一行。如果N大于9，则对应的数字规则参考16进制（比如，10用A表示，等等）

输入例子1:
7 2

输出例子1:
111
*/

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            char[] digit = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
            Stack<Character> stack = new Stack<Character>();
            if (m < 0) {
             	System.out.print("-");
             	m = -m;
             } 
            while(m > 0){
                 stack.push(digit[m%n]);
                 m /= n;
            }
            while(!stack.isEmpty()){
            	System.out.print(stack.pop());
            }
            System.out.println();
        }
    }
}