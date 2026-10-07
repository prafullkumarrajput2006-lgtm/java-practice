
import java.util.Scanner;


//         System.out.println("Hello Java");
//     }
// }






// Ques.   WAP to calculate the area of the circal... 



// public class DSA1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of radius of the circal : ");
//         float r = sc.nextInt();

//           float area = (float)(Math.PI * r * r);

//           System.out.println("The area of the circal = " + area);
//     }
// }

                                                    //  OR......
    
    
// public class DSA1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of radius of the circal : ");
//         double r = sc.nextInt();

//           double area = (Math.PI * r * r);

//           System.out.println("The area of the circal = " + area);
//     }
// }








// Ques.  WAP to find the greatest number from 3 



// public class DSA1 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the first number :");
//         int a = sc.nextInt();

//         System.out.println("Enter the seconf number :");
//         int b = sc.nextInt();

//         System.out.println("Enter the third number :");
//         int c = sc.nextInt();

//         if(a > b && a > c) {
//             System.out.println(a + " is the greatest number, which is the value of a");
//         }
//         else if (b > a && b > c) {
//             System.out.println(b + " is the greatest number, whichh is thevalue of b");
//         }
//         else {
//             System.out.println(c + " is the greatest number, which is the value of c");
//         }
//     }
// }








// Ques.   WAP to print the even number between 9 to 100... 


// public class DSA1 {
//     public static void main(String[] args) {


//         int count = 0;
//         System.out.println("Even numbers between 9 and 100");

//         for(int i=9; i<=100; i++ ) {
//             if(i % 2 == 0) {
//                 System.out.println(i);
//                 count++;
                
//             }
           
//         }
//          System.out.println("The count of even numbers : " + count);
        
//     }
// }










// // Ques.   WAP to calculate the average of the 25 score... 


// public class DSA1 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the 25 score : ");
//         int sum = 0;

//         for(int i = 1; i<=25; i++) {
//             System.out.println("score" + i + ": ");
//             int score = sc.nextInt();

//             sum = sum + score;

//         }
//         float average = (float) sum / 25;

//         System.out.println("The average of the 25 score is : " + average);
//     }
// }








// Ques.   WAP to calculate the sum of n natural number... 


// public class DSA1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number up to which you want the calculate the sum : ");

//         int sum = 0;
//         int n = sc.nextInt();

//         for(int i = 0; i <= n; i++) {
//             sum = sum + i;

//         }
//         System.out.println("The sum is "  + sum);
//     }
// }