import java.util.*;

public class day_9_1 {
    // it will print the array aisa kerney sey mujhey baar baar for loop nhi likhna
    // parega
    public static void Print_array(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // it will search for require key if it will persent the progrram will return
    // true otherwise false
    public static boolean LinearSearch(int key, int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, key;
        size = sc.nextInt();
        key = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean result;
        result = LinearSearch(key, numbers);
        System.out.println(result);
        sc.close();

    }
    
}

//time complexity =O(n)
//space complexity=O(1)
