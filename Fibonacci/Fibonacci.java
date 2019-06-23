// CMPS390 
// Fibonacci.java 
// Complete 2 methods for Fibonacci functions: recursive and iterative versions 
 
/* Fibonacci sequence are the numbers in the following integer sequence: 1, 1, 2, 3, 5, 8
 * , 13, 21, 34, 55, 89, 144, ... 
 F(n) = F(n-1) + F(n-2) F(1) = 1, F(2) = 1 */ 

import java.util.Scanner;  

public class Fibonacci {  
	
public static void main(String args[]) {   
System.out.print("Enter an positive integer to calculate Fibonacci number: "); 
Scanner input = new Scanner(System.in);    
long n = input.nextLong();

if ( n <= 0 )         
System.out.println("Number should be positive integer.");  

else  { 
long start = System.currentTimeMillis();        
System.out.println("Iterative: Fibonacci number F(" + n + ") = " + fibonacciIterative(n)); 
long end = System.currentTimeMillis();     
System.out.println("Iterative: execution time = " + (end - start));       
start = System.currentTimeMillis();   
System.out.println("Recursive: Fibonacci number F(" + n + ") = " + fibonacciRecursive(n));
end = System.currentTimeMillis();    
System.out.println("Recursive: execution time = " + (end - start)); 
}  
}  
public static long fibonacciIterative(long n) {  
	long numOne;
	long numTwo= 0; 
	long currentNum = 1;

 for (long i = 1; i < n; i++) {
numOne=numTwo;
numTwo= currentNum;
currentNum = numOne +numTwo;

 }
 return currentNum;
 
   }      
public static long fibonacciRecursive(long n) { 
 //base case
	long result;
	if (n<=1)
		return n;
		else {
		 result = fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
				
	}
 return result;
   } 
   } 
