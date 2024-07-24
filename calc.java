//SIMPLE CALCULATOR

import java.util.*;
 
class calc {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first no. = ");
    float a = sc.nextInt();

    System.out.println("Enter second no. = ");
    float b = sc.nextInt();

    System.out.println("enter the operator (+ - / *)  = ");
    char op = sc.next().charAt(0);
    float sum, diff, mul, div = 0;


    switch(op) {
        case '+' : sum = a+b;
                  System.out.println(sum);
                  break;

        case '-': diff = a-b;
                  System.out.println(diff);
                  break;          

         case '/': div = a/b;
                  System.out.println(div);
                  break;

        case '*': mul = a*b;
                  System.out.println(mul);
                  break; 
                  
        default : System.out.println("invalid operator ! ");          

        

    }
}








    

    










}


