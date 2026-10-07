
import java.util.Scanner;


//         System.out.println("Hello World");
//     }
// }






// // Ques.   Print the hollow rectangle pattern... 



// public class DSA14 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of rows : ");
//         int r = sc.nextInt();

//         System.out.println("Enter the number of columns : ");
//         int c = sc.nextInt();

//         for(int i = 1; i <= r; i++) {
//             for(int j = 1; j <= c; j++) {
//                 if(i == 1 || i == r || j == 1 || j == c) {
//                     System.out.print("*");
//                 }else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();

//         }
//     }
// }








// // Ques.   Print Inverted & Rotated half pyramid pattern... 




// public class DSA14 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows : ");
//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }









// // Ques.   Print the Inverted Half Pyramid pattern with numbers... 



// public class DSA14 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows : ");
//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n+1-i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }









// // Ques.   Print the FLOYD'S Triangle... 



// public class DSA14 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows : ");
//         int n = sc.nextInt();

//         int num = 1;

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(num + " " );
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }









// // Ques.   Print the 0/1 patter... 



// public class DSA14 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows : ");
//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                 if((i+j) % 2 == 0) {
//                     System.out.print("1"+" ");
//                 }else {
//                     System.out.print("0"+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }









// // Ques.   Print the butterfly pattern... 



// public class DSA14 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows : ");
//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             for(int j = 1; j <= 2*(n-i); j++) {
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }


//         for(int i = n; i >= 1; i--) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             for(int j = 1; j <= 2*(n-i); j++) {
//                 System.out.print(" ");
//             }
//             for(int j = 1; j<= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }










// // Ques.   Print the pattern of Solid Rhombus... 



// public class DSA14 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows :");
//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= n; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }










// // Ques.   Print the patter of Hollow Rhombus... 



// public class DSA14 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows :");
//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= n; j++) {
//                 if(i == 1 || i == n || j == 1 || j == n) {
//                     System.out.print("*");
//                 }else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }









// // Ques.   Print the diamond patter... 



// public class DSA14 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the numebr of rows : ");
//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= 2*i-1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }


//         for(int i = n; i >= 1; i--) {
//             for(int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= 2*i-1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }







// // Ques.   Print the hollow diamond patter... 



// public class DSA14 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the numebr of rows :");
//         int n = sc.nextInt();


//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= 2*i-1; j++) {
//                 if(i == 1 || i == n || j == 1 || j == n) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }


//         for(int i = n; i >= 1; i--) {
//             for(int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= 2*i-1; j++) {
//                 if(i == 1 || i == n || j == 1 || j == n) {
//                     System.out.print("*");
//                 }else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }




// Not Working... 