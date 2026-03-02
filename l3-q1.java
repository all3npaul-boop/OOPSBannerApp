import java.util.Scanner;

class LeapYearMultipleIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Not a valid Gregorian year.");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        System.out.println("Leap Year");
                    else
                        System.out.println("Not a Leap Year");
                } else {
                    System.out.println("Leap Year");
                }
            } else {
                System.out.println("Not a Leap Year");
            }
        }
        input.close();
    }
}
