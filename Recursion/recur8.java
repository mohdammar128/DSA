//print binry string
public class recur8 {
    public static void binaryStr(int n, String str, int lastPlace) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // kaam

        binaryStr(n - 1, str+="0", 0);

        if (lastPlace == 0) {
            binaryStr(n - 1, str+"1", 1);
        }

    }

    public static void main(String[] args) {
        binaryStr(3, "", 0);
    }
}
