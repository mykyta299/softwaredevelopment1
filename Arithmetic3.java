public class Arithmetic3 {
    public static void main(String[] args);
    float num1 = 23f, num2 = 6f;
    double result = 0f;
    result = num1 / num2 
    System.out.println(num1 + " / " + num2 + " = " + result);//reslt = Mat.round(result * 100.0) / 100.0;
    System.out,println("Round to 2 decimal places: " + Math.round(result * 100.0) / 100.0);
    System.out,println("Round to 3 decimal places: " + Math.round(result * 1000.0) / 1000.0);
    result = Math.round(result)
}