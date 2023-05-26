//spiral matrix problem
//kya fadu question hai bhai

import java.util.*;

public class day_13_2 {
    public static void PrintSpiral(int m[][]){
     int startRow=0;
     int endRow=m.length-1;
     int startCol=0;
     int endCol=m[0].length-1;
     while(startRow<=endRow && startCol<=endCol){
        //top row
        for(int j=startCol;j<=endCol;j++){
            System.out.print(m[startRow][j]+" ");
        }
        startRow++;
        //right col
        for(int i=startRow;i<=endRow;i++){
            System.out.print(m[i][endCol]+" ");
        }
        endCol--;
        //bottom row
        for(int j=endCol;j>=startCol;j--){
            System.out.print(m[endRow][j]+" ");
        }
        endRow--;
        //left col
        for(int i=endRow;i>=startRow;i--){
            System.out.print(m[i][startCol]+" ");
        }
        startCol++;
     }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int matrix[][] = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
             matrix[i][j]=sc.nextInt();
            }
        }
        PrintSpiral(matrix);
        
        sc.close();
    }
}
