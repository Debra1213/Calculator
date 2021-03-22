public class Calculator {

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




  public static void main(String[] args) {

    add(2,2);
    subtract(8,2);
    multiply(4,2);
    divide(4,2);
    square(3);
  }
}