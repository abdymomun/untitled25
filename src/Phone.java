import java.util.Arrays;
import java.util.Scanner;
public class Phone implements PhoneInterface {
    private String brand;
    private String name;
    private int password;
    private Contact[] contacts;

    public Phone(String brand, String name, int password, Contact[] contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }

    @Override
    public String include() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль :");
        int enteredPassword = scanner.nextInt();

        if (enteredPassword==(password)) {
            return "Телефон Включен напишите номер";
        } else {
            return "Неправильный пароль Не могу включить телефон .";

        }

    }

    @Override
    public String call() {
        Scanner scanner = new Scanner(System.in);
        long number=scanner.nextLong();
        for (Contact c : contacts) {
            if (number== c.getPhoneNumber()) {
                return " Вызов  " +c.getFullName();
            }
        }
        return "Не удается найти контакт с указанным именем или номером телефона ";
    }

    @Override
    public String searchContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите имя контакта который хотите изменить");
        String name=scanner.nextLine();
        for (Contact c : contacts) {
            if (c.getFullName().equals(name)) {
                return name + "  ";
            }
        }return "У вас нету такого контакта " + "\n"+
                "Введите еще раз";


    }

    @Override
    public String updateName(Contact contact) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите новое имя ");

        String a = scanner.nextLine();
            if (contact.getFullName().equals(a)) {

            }else {
                contact.setFullName(a);
            }
        return contact.getFullName() + " Изменено успешно ";
    }

    @Override
    public void getAllContact() {
        for (Contact c:contacts
             ) {
            System.out.println(c);

        }
    }



    public void getAllContacts() {

        for (Contact contaks: contacts) {
            System.out.println(contaks);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}


