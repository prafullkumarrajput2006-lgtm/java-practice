
//         print_statement();
//     }
// }









// Ques.   Print the sum of 2 numbers using Functions... 


// public class DSA13 {
//     public static void add_numbers() {
//         int a = 5;
//         int b = 57;
//         int sum = a + b;
//         System.out.println("The sum of two numbers is : "+ sum);
        
//     }
//     public static void main(String[] args) {
//         add_numbers();
//     }
// }







// // Syntax with Parameters... by using taking the input from the user...



// public class DSA13 {

//     public static void sum_numbers() {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the first number : ");
//         int a = sc.nextInt();

//         System.out.println("Enter the second number : ");
//         int b = sc.nextInt();

//         int sum = a + b;
//         System.out.println("Sum of " + a + " and " + b + " is : "+ sum);

//     }

//     public static void main(String[] args) {
//         sum_numbers();
//     }
// }










// // Ques.   Change the small Syntax...  sum after taking the input from the user...



// public class DSA13 {

//     public static void sum_numbers(int a, int b) {        // parameter or formal parameters...

        
//         int sum = a + b;
//         System.out.println("Sum of " + a + " and " + b + " is : "+ sum);

//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the first number : ");
//         int a = sc.nextInt();

//         System.out.println("Enter the second number : ");
//         int b = sc.nextInt();

//         sum_numbers(a, b);          // arguments or actual parameter...
//     }
// }












// // Ques.    WAP to sum 2 numbers witht he help of functions with parameter without taking the input from the user... 


// public class DSA13 {

//     public static void print_sum(int a, int b) {

//         int sum = a + b;

//         System.out.println("The sum is : " + sum);
//     }

//     public static void main(String[] args) {
        
//         int a = 10;
//         int b = 15;

//         print_sum(a, b);

//     }
// }










// // Swaping the value... 



// public class DSA13 {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 7;

//         int temp = a;
//         a = b; 
//         b = temp;
//         System.out.println("a = " + a);
//         System.out.println("b = "+ b);

//     }
// }





// // Swapping using Functions... take the input from the user...



// public class DSA13 {

//     public static void swap_num(int a, int b) {

//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("The value of a after swapping : "+ a);
//         System.out.println("The value of b after swapping : "+ b);
//     }

//     public static void main(String[] args) {

//          Scanner sc = new Scanner(System.in);

//         System.out.println("Enterthe value of a : ");
//         int a = sc.nextInt();

//         System.out.println("Enter the value of b : ");
//         int b = sc.nextInt();

//         swap_num(a, b);
//     }
// }









// // // Call by value... 

// // In this method when we performa any changes in the Function then it will be follow only that Functio not in the main Function... 
// // for eg... if we swap the value of a with b in the swap Function then it will perfectly work inside the swap function but when the main function take the access or control then it will return in the starting state means there will be no changes perform in the main function 


// public class DSA13 {
//     public static void swap_num(int a, int b) {

//         int temp = a;
//         a = b;
//         b = temp;

//          System.out.println("a = "+ a);
//         System.out.println("b = "+ b);

//     }    

//     public static void main(String[] args) {
//         int a = 5;
//         int b = 10;
//         swap_num(a, b);

       
//     }
// }







// // Ques.    Same quation with different way apply call by value... 



// public class DSA13 {
//     public static void swap_num(int a, int b) {

//         int temp = a;
//         a = b;
//         b = temp;

       

//     }    

//     public static void main(String[] args) {
//         int a = 5;
//         int b = 10;
//         swap_num(a, b);


//           System.out.println("a = "+ a);
//         System.out.println("b = "+ b);

       
//     }
// }








// // Ques... Find the product of a and b... 



// public class DSA13 {
//     public static void cal_prod() {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the first value : ");
//         int a = sc.nextInt();

//         System.out.println("ENter the second value : ");
//         int b = sc.nextInt();

//         int product = a * b;

//         System.out.println("The product of "+ a + " and " + b + " is : "+ product);

//     }

//     public static void main(String[] args) {
//         cal_prod();
//     }
// }








// // Ques.   Find the product of two numbers witht he help of parameter... 



// public class DSA13 {

//     public static void prod_nums(int a, int b) {

//         int prod = a * b;
//         System.out.println("The product of the numbers : " + prod);
//     }

//     public static void main(String[] args) {
         
//      Scanner sc = new Scanner(System.in);

//      System.out.println("Enter the first number : ");
//      int a = sc.nextInt();

//      System.out.println("Enter the second number :");
//      int b = sc.nextInt();

//         prod_nums(a, b);

//     }
// }









// // Ques.   Find the factorial of any number... 



// public class DSA13 {
//     public static void cal_fact() {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of which you want to calculate the factorial : ");
//         int n = sc.nextInt();

//         int fact = 1;

//         for(int i = 1; i <= n; i++) {

//              fact = fact * i;

//         }

//         System.out.println("The factorial of " + n + " is : " + fact);
//     }

//     public static void main(String[] args) {
        
//         cal_fact();
//     }
// }









// // Ques.   Find the factorial of a number... using parameter... 



// public class DSA13 {

//     public static void find_fact(int n ) {
//         int fact = 1;

//         for(int i = 1; i <= n; i++) {
//             fact = fact * i;
//         }
//         System.out.println("The Factorial of " + n + " is : " + fact);
//     }

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number whose you want to find the factorial :  ");
//         int n = sc.nextInt();

//         find_fact(n);
//     }
// }






// Binomial Coefficient... 













// // Function Overloading... Multiple functions with the same name but different parameters... 


// multiply_1(int a, int b)
// multiply_2(float a, float b)
// multiply_3(double a, double b)
// multiply_4(int a, int b, int c)











// // Function Overloading using parameter... 


// public class DSA13 {

//     public static int sum(int a, int b) {
//         return a + b;
//     }

//     public static int sum(int a, int b, int c) {
//         return a + b + c;
//     }

//     public static float sum(float a, float b) {
//         return a + b;
//     }


//     public static void main(String[] args) {

//         System.out.println(sum(5, 9));
//         System.out.println(sum(5, 8, 2));
//         System.out.println(sum(2.9f, 9.2f));
        
//     }
// }






// Invalid function Overloading... beacause function overloading only see the number of parameter...

// f1: sum of two numbers... 

// int sum (int a, int b){
//     return(a+b);
// }


// f2 : sum of two numbers... 

// float sum (float a, float b) {
//     return(a+b);
// }









// // Ques.   Function to calculate sum of 2 numbers... 



// public class DSA13 {

//     public static int sum(int a, int b) {
//     return a + b;
// }

// public static int sum(int a, int b, int c) {
//      return a + b + c;
// }

// public static void main(String[] args) {
//     System.out.println(sum(5,8));
//     System.out.println(sum(9,2,6));
//   } 
// }








// // Ques.   Check if a number is prime or not... using function... 



// public class DSA13 {

//     public static boolean isPrime(int n) {
       
//         for(int i = 2; i <= n-1; i++) {
//             if(n % i == 0) {
               
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
        
//         System.out.println(isPrime(13));
//     }
// }











// // Ques.   Find the prime and non-prime number with another method... 



// public class DSA13 {
    
//     public static boolean isPrime(int n) {
//         for(int i = 2; i * i < n; i++) {
//             if(n  % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }


//     public static void main(String[] args) {
        
//         System.out.println(isPrime(25));
//     }
// }


// Not working... 










// // Ques.   Print all prime in a range... 



// public class DSA13 {

//     // Prime check function
//     public static boolean isPrime(int n) {

//         if (n <= 1) {
//             return false;
//         }

//         for (int i = 2; i * i <= n; i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     // Print primes and count them
//     public static void primeInRange(int start, int end) {

//         int count = 0;

//         for (int i = start; i <= end; i++) {
//             if (isPrime(i)) {
//                 System.out.print(i + " ");
//                 count++;
//             }
//         }

//         System.out.println("\nTotal Prime Numbers: " + count);
//     }

//     public static void main(String[] args) {
//         primeInRange(1, 50);
//     }
// }















// // Ques. Binary to Decimal... 




// public class DSA13 {

//     public static int BinToDec() {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the binary number:");
//         int n = sc.nextInt();

//         int pow = 0;
//         int decNum = 0;

//         while(n > 0) {
//             int lastDigit = n % 10;

//             decNum = decNum + lastDigit * (int)Math.pow(2, pow);

//             pow++;
//             n = n / 10;
//         }

//         return decNum;
//     }

//     public static void main(String[] args) {
//         System.out.println("Decimal Number : " + BinToDec());
//     }
// }










// // Ques.   Find binary tp Decimal number using another method... 



// public class DSA13 {

//     public static void BinToDec(int binNum) {

//         int myNum = binNum;
//         int pow = 0;
//         int decNum = 0;

//         while(binNum > 0) {
//             int lastDigit = binNum % 10;
//             decNum = decNum + (lastDigit + (int)Math.pow(2, pow));
//             pow++;

//             binNum = binNum/10;
//         }
//         System.out.println("Decimal number of "+ myNum + " = "+ decNum);
//     }

//     public static void main(String[] args) {
//         BinToDec(10010);
//     }
// }










// // Ques.   Convert the number from decimal to binary... 



// public class DSA13 {
//     public static void decToBin(int n) {

//         int myNum = n;
//         int pow = 0;
//         int binNum = 0;

//         while(n > 0) {
//             int rem = n % 2;
//             binNum = binNum + (rem * (int)Math.pow(10, pow));
//             pow++; 
//             n = n/2;
//         }
//         System.out.println("The binary number of : " + myNum + " is: " + binNum);
//     }


//     public static void main(String[] args) {
//         decToBin(200);
//     }
// }










// Scope in java... 

// Scope the the method in which it tells that if we define a variable then when we can use that easily, that known as the scope of that variable... 






// Block Scope...  When a variable works in the specific part of the code or curly brackets {}













// // Ques 1.     Write the java method to compute the average of three numbers... 



// public class DSA13 {
//     public static void Avg_three(int a, int b, int c) {  

//        int  sum = a + b + c;
//         int average = sum/3;

//         System.out.println("The average of " + a + ", "+ b + ", " + c + " is :  " + average);
//     }


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the first number : ");
//         int a = sc.nextInt();

//         System.out.println("Enter the second number :");
//         int b = sc.nextInt();

//         System.out.println("Enter the third number : ");
//         int c = sc.nextInt();

//         Avg_three(a, b, c);
//     }
// }










// // Ques 2.     Write a method isEven that accepts an int argument. The method should return true if the argument si even, or false otherwose. ALso write a program to test your method... 



// public class DSA13 {

// public static void isEven(int n) {

//     if(n % 2 == 0) {
//         System.out.println("Given number is even.");
//     } else {
//         System.out.println("Given number is not even");
//     }
// }

// public static void main(String[] args) {
//     isEven(45);
//    }
// }











// // Ques 3.    Write a program to check if a number is a palindrome in java... 



// public class DSA13 {

//     public static void check_palindrome(int n) {

//         int original = n;
//         int reverse = 0;

//         while(n > 0) {
//            int lastDigit = n % 10;
//             reverse = reverse * 10 + lastDigit;
//             n = n/10;

//         }

//             if(original == reverse) {
//                 System.out.println("Given number is a Palindrome number.");
//             } else {
//                 System.out.println("Givern Number is not a Palindrome number.");
            

//         }
//     }


//     public static void main(String[] args) {
//         check_palindrome(2452);
//     }
// }

