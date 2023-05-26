import java.util.*;

public class Heap3 {
  static   class Point implements Comparable<Point> {
        int x, y;
        int dist;

        public Point(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }

        @Override
        public int compareTo(Point p2) {
            return this.dist - p2.dist;// ascending order
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        int point[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;
        for (int i = 0; i < point.length; i++) {
            int distSq = point[i][0] * point[i][0] + point[i][1] * point[i][1];
            pq.add(new Point(point[i][0], point[i][1], distSq));
        }
        for(int i=0;i<k;i++){
            Point obj=pq.remove();
            System.out.println("("+obj.x+","+obj.y+")");
        }
    }
}
