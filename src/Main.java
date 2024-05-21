import java.util.Scanner;

public class Main {
    public static boolean exit = true;

    public static void options() {
        System.out.println("(1) Create New Contact\n(2) Edit Contact\n(3) Delete Contact\n(4) Display\n(5) Exit");
        Scanner sc = new Scanner(System.in);
        Contact Swapnil = new Contact();
        int option = sc.nextInt();

        switch (option) {
            case 1:
                Swapnil.addContact();
                break;
            case 2:
                Swapnil.updateContact();
                break;
            case 3:
                Swapnil.deleteInfo();
                break;
            case 4:
                System.out.println(Swapnil.getInfo());
                break;
            case 5:
                exit = false;
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("******Welcome to Address Book*******");
        while (exit) {
            options();
        }
    }
}
