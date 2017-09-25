/*
时间限制：1秒
空间限制：32768K
小青蛙有一天不小心落入了一个地下迷宫,小青蛙希望用自己仅剩的体力值P跳出这个地下迷宫。为了让问题简单,
假设这是一个n*m的格子迷宫,迷宫每个位置为0或者1,0代表这个位置有障碍物,小青蛙达到不了这个位置;1代表小青蛙可以达到的位置。
小青蛙初始在(0,0)位置,地下迷宫的出口在(0,m-1)(保证这两个位置都是1,并且保证一定有起点到终点可达的路径),
小青蛙在迷宫中水平移动一个单位距离需要消耗1点体力值,向上爬一个单位距离需要消耗3个单位的体力值,向下移动不消耗体力值,
当小青蛙的体力值等于0的时候还没有到达出口,小青蛙将无法逃离迷宫。
现在需要你帮助小青蛙计算出能否用仅剩的体力值跳出迷宫(即达到(0,m-1)位置)。 
输入描述:
输入包括n+1行:
 第一行为三个整数n,m(3 <= m,n <= 10),P(1 <= P <= 100)
 接下来的n行:
 每行m个0或者1,以空格分隔


输出描述:
如果能逃离迷宫,则输出一行体力消耗最小的路径,输出格式见样例所示;如果不能逃离迷宫,则输出"Can not escape!"。 测试数据保证答案唯一

输入例子1:
4 4 10 
1 0 0 1 
1 1 0 1 
0 1 1 1 
0 0 1 1

输出例子1:
[0,0],[1,0],[1,1],[2,1],[2,2],[2,3],[1,3],[0,3]
*/ 

import java.util.*;
public class Main{

    static int[] dx = {};
    static int[] dy - {};
    public static Queue<point> find(int[] nums , int m , int n , int p , Queue<point> poi , int x , int y){
         if ((x==0) && (y==m-1) && p>=0) {
            return poi;
         }

         for (int i=0 ; ; ) {
             
         }
    }

    
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            int m = sc.nextInt();  //row
            int n = sc.nextInt();  //column
            int p = sc.nextInt();  //strength
            int[][] nums = new int[m][n];
            for (int i=0 ; i<m ; i++) {
                for (int j=0 ; j<n ; j++) {
                  nums[i][j] = sc.nextInt();
                }
            }

            Queue<point> poi = new LinkedList<>();
            //dfs search

            if (find(nums , m , n , p , poi , 0 , 0)) {
                
            }
        }
    }

    static class point{
      private int x;
      private int y;
      public point(int x , int y){
        this.x = x;
        this.y = y;
      }
    }
}