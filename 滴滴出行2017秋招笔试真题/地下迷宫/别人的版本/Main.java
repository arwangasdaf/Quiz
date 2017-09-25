import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private static int m = 0;
	private static int n = 0;
	private static int minCost = Integer.MAX_VALUE;
	private static int p = 0;

	private static LinkedList<Point> linkedlist = new LinkedList<>();
    private static String path = "";

    public static static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	n = in.nextInt();
    	m = in.nextInt();
    	int[][] map = new int[n][m];
    	for (int i=0 ; i<n ; i++) {
    		for (int j=0 ; j<m ; j++) {
    			map[i][j] = in.nextInt();
    		}
    	}

    	genetate(map , 0 , 0 , 0);

    	if (minCost == Integer.MAX_VALUE) {
    		System.out.println("Can not escape!");
    	}else {
    		System.out.println("");
    	}
    }

    public static void genetate(int[][] map , int x , int y , int currentCost){
    	if (currentCost > p) {
    		return;
    	}
    	map[x][y] = 2;
        linkedlist.offer(new Point(x , y));
        if (x==0 && y==m-1) {
        	if (currentCost < minCost) {
        		minCost = currentCost;
        		savePath();
        	}
        	map[x][y] = 1;
        	linkedlist.removeLast();
        	return;
        }

        //down
        if (x<n-1 && map[x+1][y] ==1) {
        	genetate(map , x + 1 , y  , currentCost);
        }
        //up
        if (x>0 && map[x+1][y] ==1) {
        	genetate(map , x - 1 , y  , currentCost + 3);
        }
        //left
        if (y>0 && map[x+1][y] ==1) {
        	genetate(map , x  , y - 1 , currentCost + 1);
        }
        //right
        if (y<m-1 && map[x+1][y] ==1) {
        	genetate(map , x , y + 1  , currentCost + 1);
        }

        map[x][y] = 1;
        linkedlist.removeLast();
    } 

    public static void savePath(){
    	Inteator<Point> iterator = linkedlist.iterator();
    	StringBuilder sd = new StringBuilder();
    	while(iterator.hasNext()){
    		Point point = iterator.next();
    		sd.append("[").append(point.x).append(",").append(point.y).append("],");
    	}
    	path.sd.toString();
    }

    public static class Point{
    	int x = 0; 
    	int y = 0;
        Point(int x , int y){
        	this.x = x;
        	this.y = y;
        }
    }
}