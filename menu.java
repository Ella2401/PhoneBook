package menu;

import service.PhoneBookService;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public void displayMenu() throws IOException {
        Scanner in = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("    WELCOME TO THE MAIN MENU");
            System.out.println();
            System.out.println("1.CREATE CONTACT");
            System.out.println("2.DISPLAY CONTACT BY NAME");
            System.out.println("3.DISPLAY CONTACT BY PHONE NUMBER");
            System.out.println("4.DISPLAY ALL CONTACTS");
            System.out.println("5.DISPLAY LIST OF CONTACTS");
            System.out.println("6.DELETE CONTACT");
            System.out.println("7.DELETE ALL CONTACTS");
            System.out.println("8.UPDATE CONTACT...");
            System.out.println("9.EXIT");
            System.out.print("SELECT YOUR OPINION:");

            int num = in.nextInt();

            PhoneBookService p = new PhoneBookService();

            switch (num) {
                case 1:
                    p.addContact();
                    Continue();
                    break;
                case 2:
                    p.displayContactByName();
                    Continue();
                    break;
                case 3:
                    p.displayContactByNumber();
                    Continue();
                    break;
                case 4:
                    p.displayAll();
                    Continue();
                    break;
                case 5:
                    p.displayList();
                    Continue();
                    break;
                case 6:
                    p.deleteContact();
                    Continue();
                    break;
                case 7:
                    p.deleteAll();
                    Continue();
                    break;
                case 8:
                    ChangeMenu();
                    Continue();
                    break;
                case 9:
                    System.out.println("THANK YOU");
                    System.exit(0);
                default:
                    break;
            }
        } while (true);
    }

    /**
     * change menu of a contact's parameters
     * */
    public void ChangeMenu() throws IOException {
        System.out.println();
        System.out.println("1. Change name");
        System.out.println("2. Change phone number");
        System.out.println("3. Change city");
        System.out.println("4. Change address");
        System.out.println("5. Change email");
        System.out.println("SELECT YOUR OPINION:");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PhoneBookService p = new PhoneBookService();

        switch (n) {
            case 1:
                p.changeName();
                break;
            case 2:
                p.changeNumber();
                break;
            case 3:
                p.changeCity();
                break;
            case 4:
                p.changeAddress();
                break;
            case 5:
                p.changeEmail();
                break;
            default:
                break;
        }
    }

    /**
     * continue display Menu or not
     */
    public void Continue() {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to continue ? 1-Yes 0-No");
        int message1 = in.nextInt();
        if (message1 != 1) {
            System.exit(0);
        }
        else{
            System.out.println();
        }
    }
}
