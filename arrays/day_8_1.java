// import java.util.*;

// class ammar {
//     static void pattern(int rows,int cols) {
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= cols; j++) {
//                 if (i == 1 || i == rows) {
//                     System.out.print("*");
//                 } else if (j == 1 || j == cols) {
//                     System.out.print("*");

//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         ammar.pattern(sc.nextInt(),sc.nextInt());
//     }
// }

// import java.util.*;
// class ammar{
//     static void patter_2(int rows,int cols){
//         for(int i=1;i<=rows;i++){
//             for(int j=1;j<=cols;j++){
//                 if(j<=rows-i){
//                     System.out.print(" ");
//                 }
//                 else{
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//     }
//  public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     ammar.patter_2(sc.nextInt(),sc.nextInt());
//   }
// }

// import java.util.*;
// class ammar{
//     static void patter_3(int rows){
//         for(int i=rows;i>=1;--i){
//          for(int j=1;j<=i;j++){
//             System.out.print(j+" ");
//          }
//          System.out.println();
//         }

//     }
//  public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     ammar.patter_3(sc.nextInt());
//   }
// }

// import java.util.*;

// class ammar {
//     static void patter_4(int rows) {
//         int k = 0;
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(k + j + " ");
//             }

//             k += i;
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("OutPut!!!!");
//         ammar.patter_4(sc.nextInt());
//     }
// }

// import java.util.*;

// class ammar {
//     static void patter_5() {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = i; j < 2*i; j++) {
//                 if (j % 2 == 0) {
//                     System.out.print("0");
//                 } else {
//                     System.out.print("1");
//                 }
//             }
//             System.out.println();

//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         ammar.patter_5();
//     }
// }

// import java.util.*;

// class ammar {
//     static void patter_6() {
//         for (int i = 1; i <=8 ; i++) {
//             for (int j = 1; j <= 8; j++) {
//                 if ((i == 1 || i == 8) && (j == 1 || j == 8)) {
//                     System.out.print("*");
//                 } else if ((i == 2 || i == 7) && (j == 2 || j == 7 || j == 1 || j == 8)) {
//                     System.out.print("*");
//                 } else if ((i == 3 || i == 6) && (j == 1 || j == 2 || j == 3 || j == 8 || j == 7 || j == 6)) {
//                     System.out.print("*");
//                 } else if (i == 4 || i == 5) {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//       ammar.patter_6();
//     }
// }

// import java.util.*;
// class ammar{
//     static void patter_7(int rows){
//         for(int i=1;i<=rows;i++){
//           for(int j=1;j<2*rows;j++){
//             if(j<=rows-i || 2*rows-i<j&&j<2*rows){
//               System.out.print(" ");
//             }
//             else{
//               System.out.print("*");
//             }
//           }
//           System.out.println();
//         }
//     }
//  public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     ammar.patter_7(sc.nextInt());
//   }
// }

// import java.util.*;

// class ammar {
//   static void patter_8(int rows) {
//     int k = 2 * rows;
//     for (int i = 1; i <= rows; i++) {
//       for (int j = 1; j < k; j++) {
//         if (j <= rows - i || (j < k && j > k - i)) {

//           System.out.print(" ");

//         } else {
//           if (i == 1 || i == rows)
//             System.out.print("*");
//           else if (j == rows-i+1 || j == k-i)
//             System.out.print("*");
//           else
//             System.out.print(" ");
//         }
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//  ammar.patter_8(sc.nextInt());
//   }
// }

// import java.util.*;

// class ammar {
//   static void pattern_9(int rows) {
//     for (int i = 1; i <= rows; i++) {
//       for (int j = 1; j <= rows - 1; j++) {
//         if ((j <= rows / 2 - i || (j >= rows / 2 + i && j < rows)) && i < rows / 2) {
//           System.out.print(" ");
//         } else if (i > rows / 2 && (j < i - rows / 2 || j > rows - (i - rows/2))) {
//           System.out.print(" ");
//         }

//         else {
//           System.out.print("*");
//         }
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     ammar.pattern_9(sc.nextInt());
//   }
// }

// import java.util.*;

// class ammar {
//   static void pattern_10(int rows) {
//     for (int i = 1; i <= rows; i++) {
//       for (int j = 1; j < 2*rows; j++) {
//         if (j <=rows - i || j >rows +i-1) {
//           System.out.print(" ");
//         } else {
//           System.out.print("*");
//         }
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     ammar.pattern_10(sc.nextInt());
//   }
// }

// import java.util.*;
// class ammar{
//     public static void InvertedPyramid(int totrows){
//         for(int i=1;i<=totrows;i++){
//             for(int j=1;j<=totrows;j++){
//                 if(j<=totrows-i){
//                     System.out.print(" ");
//                 }
//                 else{
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();

//         }
//     }
//  public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     InvertedPyramid(10);
//   }
// }

// import java.util.*;
// class ammar{
//     public static void InvertedPyramid_of_Number(int totrows){
//        for(int i=totrows;i>=1;i--){
//         for(int j=1;j<=totrows;j++){
//             if(j<=i){
//                 System.out.print(j);
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//        } 
//     }
//  public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     InvertedPyramid_of_Number(sc.nextInt());
//   }
// }
// import java.util.*;
// class ammar{
//     public static void FloydTriangle(int rows){
//         for(int i=1;i<=rows;i++){
//             int k=i*(i+1)/2;
//             for(int j=k-i+1;j<=k;j++){
//             System.out.print(j);
//             }
//             System.out.println();
//         }

//     }
//  public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     FloydTriangle(sc.nextInt());
//   }
// }

// import java.util.*;
// class ammar{
//     public static void Butterfly(int rows){
//     for(int i=0;i<rows;i++){
//        for(int j=1;j<=i;j++){
//         System.out.print("*");
//        }
//        for(int j=1;j<=2*(rows-i);j++){
//        System.out.print(" ");
//        }
//        for(int j=1;j<=i;j++){
//         System.out.print("*");
//        }
//     System.out.println();

//     }
//     // for mirro image
//     for(int i=rows;i>=1;i--){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//            }
//            for(int j=1;j<=2*(rows-i);j++){
//            System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//             System.out.print("*");
//            }
//            System.out.println();

//     }
//     }
//  public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     Butterfly(sc.nextInt());
//   }
// }


// import java.util.*;
// class ammar{
//     public static void Rhombus(int rows){
//     for(int i=1;i<=rows;i++){
//         for(int j=1;j<=rows-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=rows;j++){
//             if(j==1||j==rows||i==1||i==rows)
//             System.out.print("*");
//             else
//             System.out.print(" ");
//         }
        
//         System.out.println();
//     }
//     }
//  public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     Rhombus(sc.nextInt());
//   }
// }

// import java.util.*;
// class ammar{

//     public static void Diamond(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<n-i;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<n-i;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//  public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     Diamond(sc.nextInt());
//   }
// }