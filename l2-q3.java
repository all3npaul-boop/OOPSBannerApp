import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimeter, side;
        System.out.print("Enter perimeter: ");
        perimeter = sc.nextDouble();
        if (perimeter <= 0) {
            System.out.println("Perimeter must be a positive number.");
        } else {
            side = perimeter / 4;
            System.out.printf("Length of side is %.2f\n", side);
        }
        sc.close();
    }
}
