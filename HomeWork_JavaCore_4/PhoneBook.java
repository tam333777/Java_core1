package HomeWork_JavaCore_4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add (String LastName, String phoneNumber) {
        ArrayList<String> phonesForLastName = phoneBook.getOrDefault(LastName, new ArrayList<>());
        phonesForLastName.add(phoneNumber);
        phoneBook.put(LastName,phonesForLastName);
    }

//    метод, который получает ArrayList с телефонами
    public ArrayList <String> get(String LastName) {
        return phoneBook.get(LastName);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Petrov", "11111");
        phoneBook.add("Portnov", "22222");
        phoneBook.add("Vlasov", "33333");
        phoneBook.add("Sidorov", "444444");
        phoneBook.add("Petrov", "55555");

        System.out.println(phoneBook.get ("Sidorov"));




    }

}
