import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    ArrayList <Contacts> details = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void addDetails(){

        System.out.println("Enter the first name of the person");
        String fname = sc.next();
        System.out.println("Enter the last name of the person");
        String lname = sc.next();
        System.out.println("Enter the Address of the person");
        String address = sc.next();
        System.out.println("Enter the city of the person");
        String city = sc.next();
        System.out.println("Enter the zip of the person");
        int zip = sc.nextInt();
        System.out.println("Enter the phonenumber of the person");
        long phonenumber = sc.nextInt();
        System.out.println("Enter the email of the person");
        String email = sc.next();
        details.add(new Contacts(fname, lname,address, city, zip, phonenumber, email));
        System.out.println(details);


    }
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook system using collection ");
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.addDetails();


    }
}
