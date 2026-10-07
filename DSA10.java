
//           System.out.println(i + ". " + " Hello Prafull ");
//             i++;
//         }
//     }
// }








// Ques.   Print the number form 1 to 10... 


// public class DSA10 {
//     public static void main(String[] args) {
        
//         int i = 1;

//         while(i <= 10) {
//             // System.out.print(i+" ");
//             System.out.println(i);
//             i++;
//         }

//     }
// }






// // Ques.   Print the number from 1 to n... take the number from user...


// public class DSA10 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the number up to which you want to print the number : ");

//         int n = sc.nextInt();

//         int i = 1;
//         while(i <= n) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }









// // Ques.   WAP to print the sum of first n natural number... 


// public class DSA10 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number up to which you want to print the sum : ");

//         int n = sc.nextInt();

        
//         int sum = 0;
//         int i = 1;

//         while(i <= n) {
//             sum += i;
//             i++;
         
//         }
//         System.out.println("Total sum = " + sum);

//     }
// }








// // For Loop... 


// public class DSA10 {
//     public static void main(String[] args) {
        
//         for(int i = 1; i <=  10; i++) {
//             System.out.println("Hello Prafull");
//         }
//     }
// }








// // Ques.   Print the square Pattern... 



// public class DSA10 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of Rows : ");
//         int r = sc.nextInt();

//         System.out.println("Enter the number of the column : ");
//         int c = sc.nextInt();

//         for(int i = 1; i <= r; i++) {
//             for(int j = 1; j <= c; j++) {
//                             System.out.print("* ");
//             }
//                 System.out.println();
//         }
        
//     }
// }









// // Ques.   Print the reverse of a number... 


// public class DSA10 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number : ");
//         int n = sc.nextInt();

//         while(n > 0) {
//             int lastDigit = n % 10;
//             System.out.print(lastDigit);
//             n = n/10;
//         }
//         System.out.println();
//     }
// }








// // Ques.   Reverse the given number by scoring in reverse block... 



// public class DSA10 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENter the number : ");

//         int n = sc.nextInt();

//         int rev = 0;

//         while(n > 0) {
//             int lastDigit = n%10;
//             rev = rev*10 + lastDigit;

//         }
//         System.out.println("Reverse of the digit is : " + rev);
//     }
// }












// // Do While Loop... 


// public class DSA10 {
//     public static void main(String[] args) {
        
//         int counter = 1;
//         do { 
//             System.out.println("Hello World");
//             counter++;
//         } while (counter <= 10);
//     }
// }









// // Break Statement... 


// public class DSA10 {
//     public static void main(String[] args) {
        
//         for(int i = 1; i <= 10; i++) {
//             if(i == 5) {
//                 break;
//             }
//             System.out.println(i);
//         }
//     }
// }










// // Continue Statement... 



// public class DSA10 {
//     public static void main(String[] args) {
        
//         for(int i = 1; i <= 10; i++) {
//             if(i == 5) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }











// // Ques.   Keep enetering number till user enter a multiple of 10... 



// public class DSA10 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number :");
//         int n = sc.nextInt();

//         do {
//             if(n % 10 == 0){
//                 break;
//             }
//             System.out.println(n);
//         }
//         while (true);
//     }
// }



// Not Working... 












// // Ques.   Display all numbers entered by user except multiples of 10... 



// public class DSA10{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("ENter the number :");
//         int n = sc.nextInt();

//         do { 
//             if(n % 10 == 0) {
//                 continue;
//             }
//             System.out.println("Number was : " + n);
//         } while (true);
//     }
// }



// This is also not working due to the while condition... 








// // Ques.   Check the number is prime or not... 



// public class DSA10 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number : ");
//         int n = sc.nextInt();

//            boolean isPrime = true;
//            for(int i = 2; i < n-1; i++) {
//             if(n % i == 0) {
//                 isPrime = false;
//             }
//            }

//            if(isPrime == true) {
//             System.out.println(n+" is prime.");
//            }
//            else{
//             System.out.println(n+ " is not prime.");
//            }
//         }
// }













// public class DSA10 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of Integer : ");
//         int n = sc.nextInt();

//        int sumEven = 0;
//        int sumOdd = 0;

//        System.out.println("Enter the Integer : ");
       

//        for(int i = 1; i <= n; i++) {
//         int num = sc.nextInt();

//         if(num % 2 == 0) {
//             sumEven += num;
//         }
//         else {
//             sumOdd += num;
//         }
//        }
//        System.out.println("The sum of Even Integer : " + sumEven);
//        System.out.println("The sum of Odd Integer : " + sumOdd);

//     }
// }








// // Ques.   Same question with the help of Do while loop... 



// public class DSA10 {
//     public static void main(String[] args) {
//         System.out.println("sum of odd and even");
//         Scanner sc = new Scanner(System.in);
//         int sumOdd = 0 , sumEven = 0, ch;
//         do{
//             System.out.print("Enter the no: ");
//             int n = sc.nextInt();
//             if(n%2==0){
//                 sumEven += n;
//             }
//             else{
//                sumOdd += n;
//             }
//             System.out.println("sum of even: " + sumEven);
//             System.out.println("sum of odd: " + sumOdd);
//             // System.out.println("press 1 to continue 0 to exit: ");
//             // ch = sc.nextInt(); 
//         }
//         while(true);
      
//     }
// }








// // Ques.    WAP to print the factorial of any number... 


// public class DSA10 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number whose factorial you want to print : ");
//         int n = sc.nextInt();

//         int fact = 1;

//         for(int i = 1; i <= n; i++) {
//             fact = fact * i;
//         }

//         System.out.println("The Factorial is : " + fact);
//     }
// }










// // Ques.   Write a program to print the multiplication table of anumber N, entered by the user.



// public class DSA10 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("ENter the number which you want to print the table : ");
//         int num = sc.nextInt();

//         System.out.println("Table of " + num + " :" );

//         for(int i = 1; i <= 10; i++) {
//             System.out.println(num + " x " + i + " : " + (num*i));
//         }
//     }
// }


















