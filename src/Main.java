import java.util.*;
public class Main {
    public static void main(String[] args) {
        Boolean exit = true;
        while(exit){
            Scanner sc = new Scanner(System.in);
        System.out.println("******Welcome to Address Book*******");
        Contact Swapnil = new Contact();
        System.out.println("(1) Create New Contact\n(2) Edit Contact\n(3) Display Contact\n(4)Exit");
        int option = sc.nextInt();
        switch(option){
            case 1:
                Swapnil.addContact();
                ;
            case 2:
                Swapnil.updateContact();
                ;
            case 3:
                System.out.println(Swapnil.getInfo());
                ;
            case 4:
                exit = false;
            }
        }
    }
}
