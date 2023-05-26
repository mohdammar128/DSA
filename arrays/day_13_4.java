//searching in sorted 2D matrix
//O(n+m) if n>>m then O(n) or if m>>n then O(m)
import java.util.*;
public class day_13_4 {
    public static boolean StaircaseSearch(int matrix[][],int key){
        int m=matrix[0].length-1;
        int n=0;
        while(m>=0 && n<=matrix.length-1){
            if(key==matrix[n][m]){
                return true;
            }
            else if(key<matrix[n][m]){
                m--;//move left
            }
            else if(key>matrix[n][m]){
                n++;//move down
            }
        }
        return  false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows,cols;
        System.out.println("Enter rows and cols");
        rows=sc.nextInt();
        cols=sc.nextInt();
        int matrix[][]=new int[rows][cols];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the keys");
        int key=sc.nextInt();
        boolean res=StaircaseSearch(matrix, key);
        System.out.println(res);
        sc.close();

    }
}
