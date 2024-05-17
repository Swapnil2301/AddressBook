//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AddressBook {
        String firstName;
        String lastName;
        String address;
        String city;
        String state;
        int zip;
        int phoneNumber;
        String email;


        public AddressBook(String firstName, String lastName, String address, String city, String state, int zip, int phoneNumber, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phoneNumber = phoneNumber;
            this.email = email;

        }

        public static void main(String[] args) {
            System.out.println("Welome to address book");
        }
}