import java.util.Scanner;

public class AddressBook {
    Contacts c;
    Scanner sc = new Scanner(System.in);
    // Method to Add Contacts
    public void Add() {
        c = new Contacts();

        System.out.println("Enter First Name : ");
        String firstName = sc.nextLine();

        System.out.println("Enter Last name : ");
        String LastName = sc.nextLine();

        System.out.println("Enter City name : ");
        String cityName = sc.nextLine();

        System.out.println("Enter State name : ");
        String stateName = sc.nextLine();

        System.out.println("Enter pin number : ");
        String pinNumber = sc.nextLine();

        System.out.println("Enter Mobile No : ");
        String mobileNumber = sc.nextLine();

        System.out.println("Enter Email ID : ");
        String EmailID = sc.nextLine();

        // To Set Details for Contacts
        c.setFirstName(firstName);
        c.setLastName(LastName);
        c.setCity(cityName);
        c.setState(stateName);
        c.setPin(pinNumber);
        c.setMobileNo(mobileNumber);
        c.setEmail(EmailID);

        System.out.println(c);
    }

}

