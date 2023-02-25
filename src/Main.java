import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){

        Contact[] contacts = new Contact[3];
        contacts[0] = new Contact(700707070, "Матмуса");
        contacts[1] = new Contact(220202020, "Баха");
        contacts[2] = new Contact(320404040, "Руслан");

        Phone phone = new Phone("Apple", "iPhone 13", 2005, contacts);

        System.out.println(phone.include());
        System.out.println(phone.call());
        System.out.println(phone.searchContact());

        System.out.println(phone.updateName(contacts[0]));



            phone.getAllContact();
    }

    }
    }
