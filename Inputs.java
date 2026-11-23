import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int number;
        float dec;

        System.out.print("Enter a whole number: ");
        number = input.nextInt();
        System.out.print("Enter a decimla number: ");
        //dec =   "4.5" will cause an error to use 
        // nextFloat() to convert "4.5" to 4.5f and get dec = 4.5f
        dec = input.nextFloat();
        System.out.print("Enter a name: ");
        name = input.next();

        System.out.println(name + ", you entered the numbers " + number + "and " + dec + ".");1



        input.close();
    }
}