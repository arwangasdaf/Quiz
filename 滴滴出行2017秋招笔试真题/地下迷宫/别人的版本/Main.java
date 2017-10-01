import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
    private static int m = 0, n = 0, minCost = Integer.MAX_VALUE, p = 0;
    private static LinkedList<Point> linkedList = new LinkedList<>();
    private static String path = "";
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        p = in.nextInt();
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = in.nextInt();
            }
        }
        generate(map, 0, 0, 0);
        if (minCost == Integer.MAX_VALUE) {
            System.out.println("Can not escape!");
        } else {
            System.out.println(path.substring(0,path.length()-1));
        }
    }
 
    private static void generate(int[][] map, int x, int y, int currentCost) {
        if (currentCost > p) return;
        map[x][y] = 2;
        linkedList.offer(new Point(x, y));
        if (x == 0 && y == m - 1) {
            if (currentCost < minCost){
                minCost = currentCost;
                savePath();
            }
            map[x][y] = 1;
            linkedList.removeLast();
            return;
        }
        if (x < n - 1 && map[x + 1][y] == 1) {//down
            generate(map, x + 1, y, currentCost);
        }
        if (x > 0 && map[x - 1][y] == 1) {//up
            generate(map, x - 1, y, currentCost + 3);
        }
        if (y < m - 1 && map[x][y + 1] == 1) {//right
            generate(map, x, y + 1, currentCost + 1);
        }
        if (y > 0 && map[x][y - 1] == 1) {//left
            generate(map, x, y - 1, currentCost + 1);
        }
        map[x][y] = 1;
        linkedList.removeLast();
    }
 
    private static void savePath() {
        Iterator<Point> iterator = linkedList.iterator();
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext()) {
            Point point = iterator.next();
            sb.append("[").append(point.x).append(",").append(point.y).append("],");
        }
        path = sb.toString();
    }
 
    private static class Point {
        int x = 0;
        int y = 0;
 
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}