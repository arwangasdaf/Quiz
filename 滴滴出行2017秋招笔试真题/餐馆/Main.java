/*
某餐馆有n张桌子，每张桌子有一个参数：a 可容纳的最大人数； 有m批客人，每批客人有两个参数:b人数，c预计消费金额。 
在不允许拼桌的情况下，请实现一个算法选择其中一部分客人，使得总预计消费金额最大 
输入描述:
输入包括m+2行。 第一行两个整数n(1 <= n <= 50000),m(1 <= m <= 50000) 第二行为n个参数a,
即每个桌子可容纳的最大人数,以空格分隔,范围均在32位int范围内。 接下来m行，每行两个参数b,c。
分别表示第i批客人的人数和预计消费金额,以空格分隔,范围均在32位int范围内。

输出描述:
输出一个整数,表示最大的总预计消费金额

输入例子1:
3 5 
2 4 2 
1 3 
3 5
3 7 
5 9 
1 10

输出例子1:
20
*/


import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            int  n = sc.nextInt();        //桌子的数量
            int  m = sc.nextInt();        //客人的批数
            int[] desk = new int[n];
            for (int i=0 ; i<n ; i++) {
                desk[i] = sc.nextInt();
            }

            //对桌子的人数进行排序(从小到大)
            Arrays.sort(desk);
            //用一个优先队列来进行选择
            PriorityQueue<Customer> queue = new PriorityQueue<>();
            //
            for (int i=0 ; i<m ; i++) {
                 int b = sc.nextInt();   //人数
                 int c = sc.nextInt();   //钱数
                 if (b <= desk[n-1]) {
                     queue.add(new Customer(b , c));
                 }
            }
            //记录椅子是否被利用
            boolean[] visit = new boolean[n];
            //
            long sum = 0; //记录盈利的总和
            int count = 0 ; //记录使用的桌子的个数
            while(!queue.isEmpty()){
                  Customer customer = queue.poll();
                  for (int i=0 ; i<n ; i++) {
                      //符合分配条件
                      if (customer.peopleCount <= desk[i] && !visit[i]) {
                             sum += customer.moneyCount;
                             count++;
                             visit[i] = true;
                             break;
                      }     
                  }
                  if (count == n) {
                       break;
                  }   
            }
            System.out.println(sum);
        }
    }

    //内部Customer类
    static class Customer implements Comparable<Customer>{
        private int peopleCount;
        private int moneyCount;

        public Customer(int peopleCount , int moneyCount){
          this.peopleCount = peopleCount;
          this.moneyCount = moneyCount;
        }

        
        public int compareTo(Customer o){
          if (o.moneyCount > this.moneyCount) {
            return 1;
          }else if (o.moneyCount < this.moneyCount) {
            return -1;
          }
          return 0;
        }
    }
}