package list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list呢 = new ArrayList();
        list呢.add("list");
        List list2= new ArrayList();
        list2.addAll(list呢);
        System.out.println(list2);
    }
}
