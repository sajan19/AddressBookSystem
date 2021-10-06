import java.io.*;
import java.util.Scanner;
//Class Address Book IO
public class AddressBookIO {
    static Scanner sc=new Scanner(System.in);
    //Select Method to select Choice
    public  static void select() throws IOException {
        System.out.println("    1.Read from file ");
        System.out.println("	2.Write into file");
    //Menu Options to choose
        String menuOption;
        menuOption = sc.nextLine();
        switch (menuOption) {
            case "1":
                readAddressBook();
                break;
            case "2":
                writeAddressBook();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
    //Method to read Address Book
    public static void readAddressBook() throws IOException {
        String message;
        File file=new File("IOAddressBook.csv" +
                "");
        if(!file.exists()){
            System.out.println("file doesnt exists");
        }
        try{
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            while ((message = bufferedReader.readLine()) != null) {
                System.out.println(message);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    //Method to write Address Book
    public static void writeAddressBook(){
        System.out.println("Writing into Persons contact");
        String userInput=sc.nextLine();
        File file=new File("IOAddressBook.csv");
        if(!file.exists()){
            System.out.println("file doesnt exists");
        }
        try{
            FileWriter fileWriter=new FileWriter(file,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            fileWriter.write(userInput);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //Method to write inside Address book
    public static void writeAddressBook(PersonInfo person) {
        System.out.println("Writing into Persons contact");
        File file=new File("IOAddressBook.csv");
        if(!file.exists()){
            System.out.println("file doesnt exists");
        }
        try{
            FileWriter fileWriter=new FileWriter(file,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            fileWriter.write(String.valueOf(person));
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}