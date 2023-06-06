package homework7;

import java.util.ArrayList;
import java.util.List;

public class P4_Colors {
    public static void main(String[] args) {
        P4_Colors p4Colors=new P4_Colors();
        p4Colors.colorArrayList();
    }
    private void colorArrayList(){
        List<String> list=new ArrayList<>();
        list.add("Orange");
        list.add("Pink");
        list.add("Silver");
        list.add("White");
        list.add("Red");

        for (String temp:list){
            System.out.println(temp);
        }
    }
}
