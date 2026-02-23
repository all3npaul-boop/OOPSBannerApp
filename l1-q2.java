import java.util.Scanner;

class LargestOfThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        System.out.println("Is first largest? " + (number1 > number2 && number1 > number3));
        System.out.println("Is second largest? " + (number2 > number1 && number2 > number3));
        System.out.println("Is third largest? " + (number3 > number1 && number3 > number2));

        input.close();
    }
}
