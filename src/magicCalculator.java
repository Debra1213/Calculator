public class magicCalculator  {

  static void add(int num1, int num2) {

      int result;
      result = num1 + num2;
      System.out.println(num1 + " + " + num2 + " = " + result);
  }

    static void subtract(int num1, int num2) {

      int result;
      result = num1 - num2;
      System.out.println(num1 + " - " + num2 + " = " + result);
  }

    static void multiply(int num1, int num2) {

      int result;
      result = num1 * num2;
      System.out.println(num1 + " * " + num2 + " = " + result);
  }

    static void divide(int num1, int num2) {

      int result;
      result = num1 / num2;
      System.out.println(num1 + " / " + num2 + " = " + result);
  }
    static void square(int num1) {

      int result;
      int i = 2;
      result = num1 * i;
      System.out.println("square of " + num1 + " = " + result);  
      
  }

class MagicCalculator extends Calc {

  	static void squareRoot(int num1) {

      int result;
      result = Math.sqrt(num1);
      System.out.println("the square root of " + num1 + " is " + " = " + result);
  } 
  
  static void sine(int num1) {

      int result;
      result = Math.sin(num1);
      System.out.println("the sine of " + num1 + " is " + " = " + result);
  } 
  
  static void cosine(int num1) {

      int result;
      result = Math.cos(num1);
      System.out.println("the cosine of " + num1 + " is " + " = " + result);
  } 
  
  static void tangent(int num1) {

      int result;
      result = Math.tan(num1);
      System.out.println("the tan of " + num1 + " is " + " = " + result);
  } 
  
  static void factorial(int num1) {

      int result = 1;
      int i;  
	  for(i=1; i<=num1; i++){    
      result=result*i;    
  }    
  System.out.println("Factorial of " + num1 + " is: " + result);    
 }
}


  public static void main(String[] args) {

    add(2,2);
    subtract(8,2);
    multiply(4,2);
    divide(4,2);
    square(3);
    squareRoot(64); 
    sine(30);
    cosine(90);
    tangent(30);
    factorial(5);
  }