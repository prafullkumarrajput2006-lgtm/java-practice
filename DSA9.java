
import java.util.Scanner;









// // Conditional Statement... 


// public class DSA9 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the age : ");
//         int n = sc.nextInt();

//         if(n >= 18) {
//             System.out.println("You are adult, you can vote and drive ");

//         }
//         else if (n > 13 && n < 18) {
//             System.out.println("You are teenager");
//         }
//         else {
//             System.out.println("You are not adult, You can't vote and drive");
//         }
//     }
// }









// // Ques. Find the largest among 3 number... 


// public class DSA9 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the first number :");
//         int a = sc.nextInt();

//         System.out.println("Enter the second number :");
//         int b = sc.nextInt();

//         System.out.println("Enter the third number :");
//         int c = sc.nextInt();

//         if((a > b) && (a > c)) {
//             System.out.println(a + " is the largest number, which is the value of a");
//         }
//         else if((b > a ) && (b > c)) {
//             System.out.println(b + " is the largest number, which is the value of b");
//         }
//         else {
//             System.out.println(c + " is the largest number, which is the value of c");
//         }

//     }
// }










// // Ques. WAP for checking the number is even or odd... 


// public class DSA9 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number : ");
//         int n = sc.nextInt();

//         if(n % 2 == 0) {
//             System.out.println(n + " is even number.");
//         }
//         else{
//             System.out.println(n + " is odd number");
//         }
//     }
// }










// // Ques.   WAP to income tax calculator... 


// public class DSA9 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the income of the user : ");

//         int income = sc.nextInt();
//         int tax;

//         if(income < 500000) {
//             tax = 0;
//         }
//         else if ((income > 500000) && (income < 1000000)) {
//             tax = (int) (income * 0.2);
//         }
//         else {
//             tax = (int) (income * 0.3);
//         }
//         System.out.println("Your tax is : " + tax);
//     }
// }










// // Ternary Operators...  varibale = condition? statement1 : statement2; 



// public class DSA9 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number on whcih you want to apply the ternary operation : ");
//          int number = sc.nextInt();

//          String type = ((number % 2 == 0) ? "even" : "odd");
//          System.out.println(type);

//     }
// }









// // Switch Statement... 



// public class DSA9 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number for the switch case :");
//         int number = sc.nextInt();

//         switch(number) {
//             case 1 : System.out.println("Samosa");
//                      break;
//             case 2 : System.out.println("Burger");
//                      break;
//             case 3 : System.out.println("Mango shake");
//                      break;
//             case 4 : System.out.println("Pizza");
//                      break;
//             case 5 : System.out.println("Gol Gappe");
//                      break;
//             default: System.out.println("We wake up");
//         }
//     }
// }










// // Ques.   WAP to make a calculator... 


// public class DSA9 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the first value : ");
//         int a = sc.nextInt();

//         System.out.println("Enter the second value :");
//         int b = sc.nextInt();

//         System.out.println("Enter the operation which you want to perform on these values : ");

//         char Operator = sc.next().charAt(0);

//         switch(Operator) {
//             case '+' : System.out.println(a+b);
//                        break;
                      
//             case '-' : System.out.println(a-b);           
//                        break;

//              case '*' : System.out.println(a*b);          
//                         break;

//              case '/' : System.out.println(a/b);           
//                         break;

//              case '%' : System.out.println(a%b);           
//                         break;

//              default: System.out.println("Sorry, My calculator is not too much advance.");           
//         }
//     }
// }











// // Ques.   WAP to input week numbers and print day of week name using switch case... 



// public class DSA9 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of the week days : ");

//         int day = sc.nextInt();

//         switch(day) {
//             case 1 : System.out.println("Monday");
//             break;

//             case 2 : System.out.println("Tuesday");
//             break;

//             case 3 : System.out.println("Wednesday");
//             break;

//             case 4 : System.out.println("Thursday");
//             break;

//             case 5 : System.out.println("Friday");
//             break;

//             case 6 : System.out.println("Saturday");
//             break;

//             case 7 : System.out.println("Sunday");
//             break;
            
//             default: System.out.println("Invalid day");
//         }
//     }
// }











// // Ques.   WAP to check the year is leap or not... 



// public class DSA9 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the year : ");
//          int year = sc.nextInt();

//     if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//         System.out.println(year + " is a leap year");
//     }
//     else {
//         System.out.println(year + " is not a leap year");
//     }
//     }
// }
