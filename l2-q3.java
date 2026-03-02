import java.util.Scanner;

class MultiplesBelow100While {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number (<100): ");
        int number = input.nextInt();

        int counter = 100;
        while (counter >= 1) {
            if (counter % number == 0)
                System.out.println(counter);
            counter--;
        }
        input.close();
    }
}
