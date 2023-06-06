package homework7;

import java.util.ArrayList;
import java.util.List;

public class P6_RetriveElement {
    public static void main(String[] args) {
        P6_RetriveElement p6RetriveElement=new P6_RetriveElement();
        p6RetriveElement.retrieve();

    }
    private void retrieve(){
        List<String>list=new ArrayList<>();
        list.add("Orange");
        list.add("Pink");
        list.add("Silver");
        list.add("White");
        list.add("Red");

        System.out.println(list.get(3));

    }
}
