import java.util.Scanner;






// Variables in java... Which are use for storing the value. We can chnage the value after initialization...


// Data Types... 

// 1. Primitive Data Types
// 2. Non-Primitive Data Type







// // Input in Java... 


// 1. next
// 2. nextLine
// 3. nextInt
// 4. nextFloat
// 5. nextDouble
// 6. nextBoolean
// 7. nextShort
// 8. nextLong






// public class DSA7 {
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Enter the name : ");

//         //  String name = sc.next();
//         //  System.out.println(name);


//         String name = sc.nextLine();
//         System.out.println(name);

//     }
// }






// // Ques.   WAP of sum two numbers taking the value from the user... 


// public class DSA7 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         int sum = 0;

//         System.out.println("Enter the first number :");
//         int a = sc.nextInt();

//         System.out.println("Enter the second number :");
//         int b = sc.nextInt();

//         sum = a + b;
//         System.out.println("The sum is : " + sum);

//     }
// }








// // Ques.   WAP to calculate the area of the circle... 


// public class DSA7 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the radius of the circle :");

//         float r = sc.nextFloat();

//         float area = (float) (Math.PI * r *r);

//         System.out.println("The area of the circle is : "+ area);

//     }
// }












// Type Conversion... 


// Conversion from int to long is allowed but from long to int is not possible ... 

// byte -> short -> int -> float -> long -> double





// Type casting...

//  java compiler is not allowed us to this type of conversion from previous state but we convert forcefully and data may be loss ...






// Type Promotion in Expression... 

// 1. // It automaticaaly promotes each byte, short or char operand to int when evaluating an expression... 

// 2. // If one operand is long, float or double the whole expression is promoted to long, float or double respectively... 



// public class DSA7 {
//     public static void main(String[] args) {
//         char a = 'a';
//         char b = 'b';
        

//         System.out.println((int)(b));
//         System.out.println((int)(a));

//         System.out.println(b-a);

//     }
// }




// Type Prommotion... 


// public class DSA7 {
//     public static void main(String[] args) {
        
//         // byte b = 5;                Wrong Method...
//         // byte a = b * 2;

//         byte b = 5;
//         byte a = (byte) (b * 2);

//         System.out.println(a);

//     }
// }














