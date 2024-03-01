import java.util.Scanner;

public class even {
    static int pin = 1234;
    static int amount, withdraw;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter PIN: ");
        int check = scan.nextInt();
        while (true) {
            if (check == pin) {
                System.out.print("1. DEPOSIT\n2. WITHDRAW \n3. BALANCE \n4. PIN CHANGE \n5. EXIT\nEnter: ");
                int opt = scan.nextInt();
                switch (opt) {
                    case 1:
                        deposit();
                        break;
                    case 2:
                        withdraw();
                        break;
                    case 3:
                        balance();
                        break;
                    case 4:
                        pinchange();
                        break;
                    case 5:
                        System.out.println("Exiting");
                        System.exit(check);
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Wrong PIN");
            }
        }

    }

    static void deposit() {
        System.out.print("Enter the amount to deposited:$");
        amount = scan.nextInt();

    }

    static void withdraw() {
        System.out.print("Enter the amount of withdrawal:$");
        withdraw = scan.nextInt();
        amount -= withdraw;
        System.out.println("Remaining balance:$" + amount);
    }

    static void balance() {
        System.out.println("Available balance:$" + amount);
    }

    static void pinchange() {
        System.err.println("Current PIN: "+ pin);
        System.out.print("Enter new PIN: ");
        System.out.print("Re-enter new PIN: ");
        pin = scan.nextInt();
    }
}
