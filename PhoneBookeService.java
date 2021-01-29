package service;

import model.Contact;

import java.io.IOException;
import java.util.*;

public class PhoneBookService {

    static ArrayList<Contact> list = new ArrayList<Contact>();

    Scanner in = new Scanner(System.in);

    /**
     * save a new contact in phone book
     */
    public void addContact() throws IOException {

        System.out.println("Please enter personnel information:");
        System.out.print("Enter name:");
        String name = in.nextLine();
        System.out.print("Enter phone number:");
        String number = in.nextLine();
        System.out.print("Enter city:");
        String city = in.nextLine();
        System.out.print("Enter address:");
        String address = in.nextLine();
        System.out.print("Enter email:");
        String email = in.nextLine();

        Contact p1 = new Contact();
        int id = 1;
        p1.setId(id);
        p1.setName(name);
        p1.setPhone(number);
        p1.setCity(city);
        p1.setAddress(address);
        p1.setEmail(email);

        list.add(p1);
        System.out.println("Entry successful");

        id += 1;
    }

    /**
     * display contact's parameters by name
     */
    public void displayContactByName() {
        if (list.isEmpty()) {
            System.out.println("Empty Phonebook");
        } else {
            System.out.println("Please enter the name you want to find:");
            String name = in.nextLine();
            Iterator<Contact> it = list.iterator();
            boolean flag = false;
            while (it.hasNext()) {
                Contact person = it.next();
                if (person.getName().equals(name)) {
                    person.getContact();
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Check this person");
            }
        }
    }

    /**
     * display contact's parameters by phone number
     */
    public void displayContactByNumber() {
        if (list.isEmpty()) {
            System.out.println("Empty Phonebook");
        } else {
            System.out.println("Please enter the phone number to find:");
            String telNum = in.nextLine();
            Iterator<Contact> it = list.iterator();
            boolean flag = false;
            while (it.hasNext()) {
                Contact person = it.next();
                if (person.getPhone().equals(telNum)) {
                    person.getContact();
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Check this person");
            }
        }
    }

    /**
     * display all contacts
     */
    public void displayAll() {
        if (list.isEmpty()) {
            System.out.println("Empty Phonebook");
        } else {
            Iterator<Contact> it = list.iterator();
            int id = 1;
            System.out.println();
            System.out.println("       PHONE BOOK");
            while (it.hasNext()) {
                Contact person = it.next();
                person.setId(id++);
                System.out.println();
                person.getContact();
            }
        }
    }

    /**
     * display contacts' names
     */
    public void displayList() {
        if (list.isEmpty()) {
            System.out.println("Empty Phonebook");
        } else {
            Iterator<Contact> it = list.iterator();
            int id = 1;
            System.out.println();
            System.out.println("       PHONE BOOK");
            while (it.hasNext()) {
                Contact person = it.next();
                person.setId(id++);
                System.out.println("  " + (id - 1) + ". " + person.getName());
            }
        }
    }

    /**
     * delete contact by name
     */
    public void deleteContact() throws IOException {
        if (list.isEmpty()) {
            System.out.println("Empty Phonebook");
        } else {
            System.out.println("Please enter the name of the person to be deleted:");
            String name = in.nextLine();
            Iterator<Contact> it = list.iterator();
            boolean flag = false;
            int serialNumber = 0;
            while (it.hasNext()) {
                Contact person = it.next();
                if (person.getName().equals(name)) {
                    System.out.println(person.getId());
                    serialNumber = person.getId();
                    flag = true;
                }
            }
            if (flag) {
                list.remove(serialNumber - 1);
                System.out.println("successfully deleted!");
            } else {
                System.out.println("Wrong input name");
            }

            int id = 1;
            Iterator<Contact> it1 = list.iterator();
            while (it1.hasNext()) {
                it1.next().setId(id);
                id++;
            }
        }
    }

    /**
     * delete all contacts
     */
    public void deleteAll() throws IOException {
        list.clear();
        System.out.println("Empty Phonebook");

    }

    /**
     * change contact's name
     */
    public void changeName() {
        int serNum = change();
        if (serNum != 0) {
            System.out.print("Please enter a new name:");
            String name2 = in.nextLine();
            list.get(serNum - 1).setName(name2);
            System.out.println("Successfully changed!");
        } else {
            System.out.println("Wrong input name");
        }
    }

    /**
     * change phone number
     */
    public void changeNumber() {
        int serNum = change();
        if (serNum != 0) {
            System.out.print("Please enter a new phone number:");
            String num = in.nextLine();
            list.get(serNum - 1).setPhone(num);
            System.out.println("Successfully changed!");
        } else {
            System.out.println("Wrong input name");
        }
    }

    /**
     * change contact's city
     */
    public void changeCity() {
        int serNum = change();
        if (serNum != 0) {
            System.out.print("Please enter a new city:");
            String city = in.nextLine();
            list.get(serNum - 1).setCity(city);
            System.out.println("Successfully changed!");
        } else {
            System.out.println("Wrong input name");
        }
    }

    /**
     * change contact's address
     */
    public void changeAddress() {
        int serNum = change();
        if (serNum != 0) {
            System.out.print("Please enter a new address:");
            String add = in.nextLine();
            list.get(serNum - 1).setAddress(add);
            System.out.println("Successfully changed!");
        } else {
            System.out.println("Wrong input name");
        }
    }

    /**
     * change contact's email
     */
    public void changeEmail() {
        int serNum = change();
        if (serNum != 0) {
            System.out.print("Please enter a new email:");
            String em = in.nextLine();
            list.get(serNum - 1).setEmail(em);
            System.out.println("Successfully changed!");
        } else {
            System.out.println("Wrong input name");
        }
    }

    /**
     * get serial number of the person to be changed
     * @return serialNumber
     */
    public int change() {
        int serialNumber = 0;
        if (list.isEmpty()) {
            System.out.println("Empty Phonebook");
        } else {
            System.out.print("Please enter the name of the person to be changed:");
            String name = in.nextLine();
            Iterator<Contact> it = list.iterator();

            while (it.hasNext()) {
                Contact person = it.next();
                if (person.getName().equals(name)) {
                    serialNumber = person.getId();
                }
            }
        }
        return serialNumber;
    }
}
