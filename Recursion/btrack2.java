
import java.util.Scanner;

public class btrack2 {

    // rat maze problem solution

    // public static boolean isSafe(int maze[][], int i, int j) {
    // // right side check ker raha hoon kya mai move ker sakta hoon ya nhi
    // if (maze[i][j] == 1) {
    // return true;
    // }

    // return false;
    // }

    // public static boolean ratMove(int maze[][], int row, int col, int sol[][]) {
    // // Base case
    // if (row == maze.length || col == maze.length) {
    // return false;
    // } else if (row == maze.length - 1 && col == maze.length - 1 &&
    // maze[row][col]==1) {
    // sol[row][col]=1;
    // return true;
    // }
    // // recursize call

    // if (isSafe(maze, row, col)) {
    // sol[row][col] = 1;
    // if (ratMove(maze, row + 1, col, sol)) {
    // return true;
    // }
    // if (ratMove(maze, row, col + 1, sol)) {
    // return true;
    // }
    // sol[row][col] = 0;

    // }
    // return false;

    // }
    // public static void print_arr(int arr[][]){
    // System.out.println("path is : ");
    // for(int i=0;i<arr.length;i++){
    // for(int j=0;j<arr.length;j++){
    // System.out.print(arr[i][j]+" ");
    // }
    // System.out.println();
    // }

    // }

    //

    public static boolean isSafe(int maze[][], int i, int j) {
        if (maze[i][j] == 1) {
            return true;
        }
        return false;
    }

    public static void ratMaze(int maze[][], int i, int j, int sol[][]) {
        // base condition
        if (i == maze.length - 1 && j == maze.length - 1 && maze[i][j] == 1) {
            sol[i][j] = 1;
            print_arr(sol);
            return;
        } else if (i == maze.length || j == maze.length) {
            return;
        }
        // recursive step
        if (isSafe(maze, i, j)) {
            sol[i][j] = 1;
            ratMaze(maze, i + 1, j, sol);
            ratMaze(maze, i, j + 1, sol);
            sol[i][j] = 0;
        }
    }

    public static void print_arr(int maze[][]) {
        System.out.println("-------------------------path for rat----------------------");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int sol[][] = new int[n][n];
        // int maze[][] = new int[4][4];
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // maze[i][j] = sc.nextInt();
        // }
        // }
        int maze[][] = { { 1, 1, 1, 0 }, { 1, 1, 1, 1 }, { 0, 0, 1, 1 }, { 1, 1, 1, 1 } };
        ratMaze(maze, 0, 0, sol);
        sc.close();
        
    }

}
