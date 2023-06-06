package homework7;

import java.util.HashMap;
import java.util.Map;

public class P9_HashMapPeople {
    public static void main(String[] args) {
        P9_HashMapPeople p9HashMapPeople=new P9_HashMapPeople();
        p9HashMapPeople.map();

    }
    private void map(){
        Map<String,Integer>people=new HashMap<>();
        people.put("Pooja", 35);
        people.put("Shaiphali", 37);
        people.put("Rikita", 28);

        for(Map.Entry<String,Integer>entry:people.entrySet()){
            System.out.println(entry.getKey()+"/"+entry.getValue());
        }
    }
}
