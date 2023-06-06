package homework7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P5_ArrayListiterator {
    public static void main(String[]args){
        P5_ArrayListiterator p5ArrayListiterator=new P5_ArrayListiterator();
        p5ArrayListiterator.arryIterator();
    }
    private void arryIterator(){
        List<String> list=new ArrayList<>();
        list.add("orange");
        list.add("Pink");
        list.add("Silver");
        list.add("White");
        list.add("Red");

        Iterator<String>iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
