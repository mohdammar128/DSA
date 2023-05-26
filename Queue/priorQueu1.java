package Queue;

import java.util.*;

public class priorQueu1 {
    // comparable jo hai yeah ak interface hai jo obj ko compare kerney kii
    // permission dey deta hai
    // compareTo functionis present in Comparable
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        // Comparator.reverseOrder() => yeah priority order ko reverse kerdeta hai
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Student> pq = new PriorityQueue<>();
        // O(logn)
        // pq.add(3);
        // pq.add(5);
        // pq.add(1);
        // pq.add(4);
        pq.add(new Student("Ammar", 30));
        pq.add(new Student("Abinav", 20));
        pq.add(new Student("Aditya", 50));
        pq.add(new Student("Avi", 35));
        while (!pq.isEmpty()) {
            System.out.println(pq.remove().rank);
        }
    }
}
