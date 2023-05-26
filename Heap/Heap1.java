import java.util.*;

public class Heap1 {
  static class MinHeap {
    static ArrayList<Integer> arr = new ArrayList<>();

    /* Insert into heap */
    public void add(int data) {
      arr.add(data);
      int x = arr.size() - 1;// child node position
      int parent = (x - 1) / 2;// prent of child node x
      // log(n)
      while (arr.get(x) < arr.get(parent)) {
        // swap

        int temp = arr.get(parent);
        arr.set(parent, arr.get(x));
        arr.set(x, temp);
        x = parent;
        parent = (x - 1) / 2;
      }

    }

    private void heapify(int i) {
      // i is the parent node
      int left = 2 * i + 1;
      int right = 2 * i + 2;
      int minIdx = i;
      if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
        minIdx = left;
      }
      if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
        minIdx = right;
      }
      if (minIdx != i) {
        // swap
        int temp = arr.get(i);
        arr.set(i, arr.get(minIdx));
        arr.set(minIdx, temp);
        heapify(minIdx);
      }

    }

    // minimum element
    public int peek() {
      return arr.get(0);
    }

    public int remove() {
      int data = arr.get(0);
      // step 1- swaap first and last element
      int temp = arr.get(arr.size() - 1);
      arr.set(arr.size() - 1, arr.get(0));
      arr.set(0, temp);
      // delete last
      arr.remove(arr.size() - 1);
      // heapify
      heapify(0);
      return data;

    }

    public boolean isEmpty() {
      return arr.size() == 0;
    }

  }

  public static void main(String[] args) {
    MinHeap h = new MinHeap();
    h.add(3);
    h.add(4);
    h.add(1);
    h.add(5);
    h.add(0);
    System.out.println(h);
    // h.remove();
    // h.add(4);
    // h.add(5);
    // System.out.println(h.peek());

    while (!h.isEmpty()) {
      System.out.println(h.remove());
    }

  }

}
