
import java.util.Scanner;


//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of print : ");

//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println( );
//         }
//     }
// }








// // Ques.    Print the inverted(reverse) triangle pattern... 



// public class DSA11 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of line :");
//         int n = sc.nextInt();

//         for(int i = n; i >= 1; i--) {
//             for(int j = i; j >= 1; j--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }







// // Ques.   Print half-Pyramid pattern for numbers... 


// public class DSA11 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of lines : ");

//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(j);
                
//             }
//             System.out.println();
//         }
//     }
// }









// // Ques.   Print the reverse half pyramid number pattern... 



// public class DSA11 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of lines : ");

//         int n = sc.nextInt();

//         for(int i = n; i >= 1; i--) {
//             for(int j = i; j >= 1; j--) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }









// // Ques.   Print the half pyramid of character... and the next line should be start from next character... 


// public class DSA11 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of line : ");

//         int n = sc.nextInt();
//         char ch = 'A';

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                    System.out.print(ch);
//                    ch++;
//             }
//             System.out.println();
//         }
//     }
// }











// // Ques.   Print the half pyramid pattern of number in which the next line should be start form the next integer... 



// public class DSA11 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of lines :");

//         int n = sc.nextInt();

//         int num = 1;

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(num);
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }









// // Ques.   WAP to print the hollow rectangle pattern... 


// public class DSA11 {
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
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println( );
//         } 
//     }
// }








// // Ques.   Print the inverted and rotated half pyramid pattern... 


// public class DSA11 {
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








// // Ques.   Print the half-pyramid with numbers pattern... 


// public class DSA11 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the numeber of rows : ");
//         int n = sc.nextInt();

//         for(int i = n; i >= 1; i--) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }








// // Ques.   Print the FLOYD's Triangle pattern... 


// public class DSA11 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows : ");
//         int n = sc.nextInt();

//         int num = 1;

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(num);
//                 num++;
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }









// // Ques.   Print the 0-1 Triangle pattern... 


// public class DSA11 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of rows : ");
//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {

//                 if((i + j) % 2 == 0) {
//                     System.out.print("1");
//                     System.out.print(" ");
//                 }
//                 else {
//                     System.out.print("0");
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }











// // Ques.   Print the butterfly pattern... 



// public class DSA11 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the numebr of rows : ");
//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
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
//             for(int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }








// // Ques.   Print the solid Rhombus pattern... 



// public class DSA11 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows : ");
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






// // Ques.   Print the hollow Rhombus pattern... 


// public class DSA11 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows : ");
//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= n; j++) {
//                 if(i == 1 || j == 1 || i == n || j == n) {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }











// // Ques.   Print the diamond pattern... 



// public class DSA11 {
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Enter the number of rows : ");
//          int n = sc.nextInt();

//          for(int i = 1; i <= n; i++) {
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














