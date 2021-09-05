import java.util.Scanner;

public class AddressBookMain {
    // main method
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System ! ");
        //Create an Object
        Contacts obj = new Contacts();
        obj.setFirstName("sajan");
        obj.setLastName("mhatre");
        obj.setCity("vashi");
        obj.setState("goa");
        obj.setPin("500876");
        obj.setMobileNo("9988663344");
        obj.setEmail("sajanm66@gmail.com");
        System.out.println("Contact details: "+obj.getFirstName()+" "+ obj.getLastName()+" "+ obj.getCity()+" "+ obj.getState()+" "+ obj.getPin()+" "+ obj.getMobileNo()+" "+ obj.getEmail());
        System.out.println("Thank for Using Address book");

    }
}

