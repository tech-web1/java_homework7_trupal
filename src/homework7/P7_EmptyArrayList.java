package homework7;

import java.util.ArrayList;
import java.util.List;

public class P7_EmptyArrayList {

    public static void main(String[] args) {
        P7_EmptyArrayList p7EmptyArrayList=new P7_EmptyArrayList();
        p7EmptyArrayList.arrayListEmpty();
    }
    private void arrayListEmpty(){
        List<String>list=new ArrayList<>();
        list.add("Pooja");
        list.add("Rikita");
        list.add("Bansari");
        list.add("Shaiphali");
        list.add("Shweta");
        list.add("Shylanthi");


        System.out.println(list.isEmpty());


    }
}
