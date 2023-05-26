import java.util.*;

public class Hash2 {
    static class HashMap<K, V> {
        class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int N;
        private int n;
        private LinkedList<Node> buckets[];
        @SuppressWarnings("unchecked")

        HashMap() {

            this.N = 4;
            this.buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }

        }

        public int hashFuncion(K key) {
            int hc = key.hashCode();
            int bi = Math.abs(hc) % N;
            return bi;
        }

        public int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        public void put(K key, V value) {
            int bi = hashFuncion(key);
            int di = searchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
            }

        }
    }
}
