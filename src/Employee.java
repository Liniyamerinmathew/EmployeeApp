import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your option : 1. AddEmployee \n 2. Substraction \n 3. Multiplication \n 4. Division\n 5. Exit");
        option = sc.nextInt();
        switch (option) {
            case 1:
                Addition();
                break;
            case 2:
                Substraction();
                break;
            case 3:
                Multiplication();
                break;
            case 4:
                Division();
                break;

            default:
                System.out.println("Invalid choice");
        }

}
