package General;

import java.util.*;

public class str2 {
    public static float shortestPath(String path) {
        int n = path.length();
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            //
            if (path.charAt(i) == 'W') {
                x--;
            } else if (path.charAt(i) == 'E') {
                x++;
            } else if (path.charAt(i) == 'S') {
                y--;
            } else {
                y++;
            }
        }
        float shorPath = (float) (Math.sqrt(x * x + y * y));
        return shorPath;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path=sc.nextLine();
        float res=shortestPath(path);
        System.out.println(res);
        
        sc.close();
    }
}
