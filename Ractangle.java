import java.util.Scanner;
public class Ractangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = 0, width = 0, area = 0;
        String unit = "";
        System.out.print("Enter your length of rectangle: ");
        length = input.nextInt();
        System.out.print("Enter width of rectangle: ");
        width = input.nextInt();

        area = length * width;

        System.out.print("Enter unit od measurement: ");
        unit = input.next();
        System.out.println("Area of rectangle is " + area + " " + unit + " square");
        input.close();
    }
    
}
