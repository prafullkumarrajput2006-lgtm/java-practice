
// import java.util.Scanner;

// public class OneShot1 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number :");
//         int n = sc.nextInt();

//         if(n%2 == 0) {
//             System.out.println("Given number is even");
//         } else {
//             System.out.println("Given number is odd");
//         }
//     }
// }
     








// // // Ques.   Take positive integer input and tell if it is divisible by 5 or not... 


// // public class OneShot1 {
// //     public static void main(String[] args) {
        
// //         Scanner sc = new Scanner(System.in);

// //         System.out.println("Enter a number : ");
// //         int n = sc.nextInt();

// //         if(n%5 == 0) {
// //             System.out.println("The number you entered is divisible by 5 ");
// //         } else {
// //             System.out.println("The number you entered is not divisible by 5");
// //         }
// //     }
// // }









// // // Ques.   Take integer input and print the absolute value of that integer... 


// // public class OneShot1 {
// //     public static void main(String[] args) {
        
// //         Scanner sc = new Scanner(System.in);

// //         System.out.println("Enter any integer : ");
// //         int n = sc.nextInt();

// //         if(n<0) {
// //             n = n * (-1);
// //         }

// //         System.out.println("The absolute value is : " + n);
// //     }
// // }







// // // Ques.   If the cost price and selling price of an item is input through the keyboard, write a program to determine whether the seller has made profit r incurres loss. Also determine how much profit he made orloss he incurred... 


// // public class OneShot1 {
// //     public static void main(String[] args) {
         
// //         Scanner sc = new Scanner(System.in);

// //         System.out.println("Enter cost price : ");
// //         int cp = sc.nextInt();

// //         System.out.println("Enter the selling price : " );
// //         int sp = sc.nextInt();

// //         if(sp > cp) {
// //             System.out.println("You gain the profit of " + (sp - cp));
// //         } else {
// //             System.out.println("You incurred a lose of " + (cp - sp) );
// //         }
// //     }
// // }









// // // Ques.     Given the lenght and breadth of a rectangle, Write a prpgramto dind the whether the area of the rectangle is greater than its perimeter... 


// // public class OneShot1 {
// //     public static void main(String[] args) {
        
// //         Scanner sc = new Scanner(System.in);

// //         System.out.println("Enter the lenght :");
// //         int lenght = sc.nextInt();

// //         System.out.println("Enter the breadth :");
// //         int breadth = sc.nextInt();

// //         int area = lenght*lenght;
// //         int perimeter = 2* (lenght + breadth);

// //         if(area > perimeter) {
// //             System.out.println("Area is greater than Perimeter");
// //         } else if (area< perimeter)  {
// //             System.out.println("Perimeter is greater than Area");
// //         } else {
// //             System.out.println("Both are equal");
// //         }
// //     }
// // }










// // // Ques.    Take input percentage of a student and print the grade according to marks... 



// // public class OneShot1 {
// //     public static void main(String[] args) {

// //         Scanner sc = new Scanner(System.in);

// //         System.out.println("Enter the Marks :");

// //         int marks = sc.nextInt();

// //         if(marks < 100 && marks >= 90)
// //         System.out.println("Excellent");

// //         else if(marks < 90 && marks >= 80 ) {
// //             System.out.println("Very Good");
// //         }

// //         else if(marks < 80 && marks >= 70 ) {
// //             System.out.println(" Good");
// //         }

// //         else if(marks < 70 && marks >= 60 ) {
// //             System.out.println("Can do better");
// //         }

// //         else if(marks < 60 && marks >= 50 ) {
// //             System.out.println("Average");
// //         }

// //         else if(marks < 50 && marks >= 40 ) {
// //             System.out.println("Below Average");
// //         }

// //         else {
// //             System.out.println("Fail");
// //         }
// //     }
// // }








// // // Ques.   Take positive integer input and tell if it is divible by 3 and 5... 



// // public class OneShot1 {
// //     public static void main(String[] args) {
        
// //         Scanner sc = new Scanner(System.in);

// //         System.out.println("Enter the number :");

// //         int n = sc.nextInt();

// //         if(n%3 == 0 && n%5 == 0) {
// //             System.out.println( n + " is divisible by 3 and 5 ");
// //         }
// //         else {
// //             System.out.println( n  + " is not divisible by 3 and 5");
// //         }
// //     }
// // }









// // // Ques.     Take positive integer input and tell if it is divible by 3 or  5... 





// // public class OneShot1 {
// //     public static void main(String[] args) {
        
// //         Scanner sc = new Scanner(System.in);

// //         System.out.println("Enter the number :");

// //         int n = sc.nextInt();

// //         if(n%3 == 0 || n%5 == 0) {
// //             System.out.println( n + " is divisible by 3 or 5 ");
// //         }
// //         else {
// //             System.out.println( n  + " is not divisible by 3 or 5");
// //         }
// //     }
// // }










// // // Ques.    Take 3 numbers input and tell if they canbe the sides of a triangle... 



// // public class OneShot1 {
// //     public static void main(String[] args) {
        
// //         Scanner sc = new Scanner(System.in);

// //         System.out.println("Enter the First side :");
// //         int a = sc.nextInt();

// //          System.out.println("Enter the Second side :");
// //         int b = sc.nextInt();

// //          System.out.println("Enter the Third side :");
// //         int c = sc.nextInt();

// //         if((a+b)>c && (b+c)>a && (a+c)>b){
// //             System.out.println("Valid Triangle");
// //         } else{
// //             System.out.println("Invalid Triangle");
// //         }
// //     }
// // }








// // Nested if - else Statement... 



// // Ques.   WAP to find the if a number is divisible by both 3 and 5... 






// public class OneShot1 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the Number :");
//         int n = sc.nextInt();

//         if(n%5== 0){
//             if(n%3== 0) {
//                 System.out.println("The given number is divible by 3 and 5");
//             } else{
//                 System.out.println("Not Divisible");
//             }
//         } else {
//             System.out.println("Not Divisible");
//         }

//     }
// }











// // Ques.   Take 3 positive integeer input and print the greatest of them... 


// public class OneShot1 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the First Number :  ");
//         int a = sc.nextInt();

//          System.out.println("Enter the Second Number :  ");
//         int b = sc.nextInt();

//          System.out.println("Enter the Third Number :  ");
//         int c = sc.nextInt();

//         if(a>b) {
//             if(a>c) {
//                 System.out.println(a + " is largest which is the value of a ");
//             } else {
//                 System.out.println(c + " is largest which is the value of c ");
//             }
//         } else {
//             if(b>c) {
//                 System.out.println(b + " is largest which is the value of b");
//             } else{
//                 System.out.println(c + " is largest which is the value of c");
//             }
//         }
//       } 
//     }











// // Ques.   Given three points (x1,y1), (x2,y2) and (x3,y3) write a program to check if all the three points fall on one straight line... 

//     //   (y2-y1/ x2-x1) = (y3-y2/x3-x2)    This condition must be statisfied for straight line... 




// public class OneShot1 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the value of x1 :");
//         double x1 = sc.nextDouble();

//          System.out.println("Enter the value of x2 :");
//         double x2 = sc.nextDouble();

//          System.out.println("Enter the value of x3 :");
//         double x3 = sc.nextDouble();

//          System.out.println("Enter the value of y1 :");
//         double y1 = sc.nextDouble();

//          System.out.println("Enter the value of y2 :");
//         double y2 = sc.nextDouble();

//          System.out.println("Enter the value of y3 :");
//         double y3 = sc.nextDouble();

//         double m1 = (y2-y1)/ (x2-x1);
//         double m2 = (y3-y2)/ (x3-x2);

//         if(m1 == m2) {
//             System.out.println("The three points lie on a single line");
//         } else {
//             System.out.println("The three points are not lie on a single line ");
//         }
//     }
// }










// // Ques.   Predict the Output... 



// public class OneShot1 {
//     public static void main(String[] args) {
        
//         int k = 35;
//         System.out.println(k==35);
//         System.out.println(k=50);
//         System.out.println(k>60);
//     }
// }





// // Ques.   Predict the Output...   Compare with the is ASCII value of the character


// public  class OneShot1 {
//     public static void main(String[] args) {
        
//         int i = 64;
//         char j = 'A';
//         if(i==j) {
//             System.out.println("C is WOW");

//         } else {
//             System.out.println("C is Headache");
//         }
//     }
// }












  
