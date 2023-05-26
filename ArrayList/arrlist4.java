package ArrayList;

import java.util.*;

class arrlist4 {
    public static boolean pairSum_2(ArrayList<Integer> list, int target) {
        int bp = -1;// breaking point
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1;// smallest
        int rp = bp;// largest
        while (lp != rp) {
            int sum = list.get(rp) + list.get(lp);
            if (sum == target) {
                return true;
            } else if (sum > target) {
                rp = (n - 1 + rp) % n;
            } else {
                lp = (lp + 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        boolean res = pairSum_2(list, sc.nextInt());
        System.out.println(res);
        sc.close();
    }
}