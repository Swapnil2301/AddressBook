import java.util.*;
public class Contact {
    public String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    public Contact() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    static HashMap<String, String> Person = new HashMap<String, String>();

    public void addContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String first_name = sc.nextLine();
        Person.put("First Name", first_name);
        System.out.println("Enter Last name");
        String last_name = sc.nextLine();
        Person.put("last_name", last_name);
        System.out.println("Enter Address");
        String address = sc.nextLine();
        Person.put("Address", address);
        System.out.println("Enter City");
        String city = sc.nextLine();
        Person.put("City", city);
        System.out.println("Enter State");
        String state = sc.nextLine();
        Person.put("State is", state);
        System.out.println("Enter Zip");
        String zip = sc.nextLine();
        Person.put("Zip", zip);
        System.out.println("Enter Phone number");
        String ph_number = sc.nextLine();
        Person.put("Number", ph_number);
        System.out.println("Enter Email");
        String email = sc.nextLine();
        Person.put("Email is", email);


    }

    public void updateContact() {
        System.out.println("Enter Value to Change\n(1) First name\n(2) Last name\n(3) Address\n(4) City\n(5) State\n(6) Zip\n(7) Phone\n(8) Phone Number\n(9) Email");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        sc.nextLine();
        String newValue;
        switch (option) {
            case 1:
                System.out.println("Enter new First name:");
                newValue = sc.nextLine();
                Person.put("firstName", newValue);
                break;
            case 2:
                System.out.println("Enter new Last name:");
                newValue = sc.nextLine();
                Person.put("lastName", newValue);
                break;
            case 3:
                System.out.println("Enter new Address:");
                newValue = sc.nextLine();
                Person.put("address", newValue);
                break;
            case 4:
                System.out.println("Enter new City:");
                newValue = sc.nextLine();
                Person.put("city", newValue);
                break;
            case 5:
                System.out.println("Enter new State:");
                newValue = sc.nextLine();
                Person.put("state", newValue);
                break;
            case 6:
                System.out.println("Enter new Zip:");
                newValue = sc.nextLine();
                Person.put("zip", newValue);
                break;
            case 7:
                System.out.println("Enter new Phone Number:");
                newValue = sc.nextLine();
                Person.put("phoneNumber", newValue);
                ;
            case 8:
                System.out.println("Enter new Email:");
                newValue = sc.nextLine();
                Person.put("email", newValue);
                ;
            default:
                System.out.println("Invalid option.");
                ;
        }
    }

    public  String getInfo() {
        System.out.println("Updated Contact Information:");
        String output = "";
        for (Map.Entry<String, String> entry : Person.entrySet()) {
            output = output +"\n"+(entry.getKey() + " is : " + entry.getValue());
        }
        return output;
    }
}