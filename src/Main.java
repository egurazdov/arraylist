import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list1.add("1");
        list1.add("1");
        list1.add("1");
        Collections.copy(list1, list);
        System.out.println(list1);
        System.out.println("Такой цвет есть в списке - " + findElement("reeed", list));
    }

    private static boolean findElement(String colour, List<String> list) {
        return list.contains(colour);
    }
}