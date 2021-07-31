package Lesson3;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        String[] fruit = {"apple","orange", "melon","apple","kiwi","kiwi","banana","kiwi","pear","mango","papaya"};
        HashMap<String,Integer> fetus = new HashMap<>();
        for (String x : fruit) {
            fetus.put(x, fetus.getOrDefault(x,0)+1);
        }
        System.out.println(fetus);
        Phonebook book = new Phonebook();
        book.addContact("Roma", "363487");
        book.addContact("Rita", "870977");
        book.addContact("Kola", "544456");
        book.addContact("Roma", "877765");
        book.addContact("Sena", "877737");
        book.addContact("Sena", "877733");

        book.findAndPrint("Roma");
        book.findAndPrint("Sena");
        book.findAndPrint("Kola");
    }
}
