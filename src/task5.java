import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class task5{
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){ // добаляет номера в книгу
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    public static void printBook(Map<String, ArrayList<Integer>> map){ // печать
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + "  ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> PhoneBook = new HashMap<>();
        addNumber("Maltsev", 297452621, PhoneBook);
        addNumber("Rudev", 292647164, PhoneBook);
        addNumber("Vorobey", 297426489, PhoneBook);
        addNumber("Maltsev", 442759201, PhoneBook);
        addNumber("Rudev", 256781930, PhoneBook);
        addNumber("Chayka", 294352789, PhoneBook);
        addNumber("Kostyukevich", 292496313, PhoneBook);
        addNumber("Titovec", 294689023, PhoneBook);
        printBook(PhoneBook);
    }
}