import java.util.*;

class Heap5 {
    static class Row implements Comparable<Row> {
        int soldiers;
        int indx;

        Row(int soldiers, int indx) {
            this.soldiers = soldiers;
            this.indx = indx;

        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldiers == r2.soldiers) {
                return this.indx - r2.indx;// ascending order
            } else {
                return this.soldiers - r2.soldiers;
            }
        }
    }

    public static void main(String[] args) {
        int army[][] = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
        int k = 2;
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(count, i));
        }
        for (int i = 0; i < k; i++) {
        Row obj=pq.remove();
        System.out.println("row"+" "+obj.indx);
        }
    }

}