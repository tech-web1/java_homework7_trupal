package homework7;

import java.util.HashSet;
import java.util.Set;

public class P8_HashSetInteger {
    public static void main(String[] args) {
        P8_HashSetInteger p8HashSetInteger=new P8_HashSetInteger();
        p8HashSetInteger.set();

    }
    private void set(){
        Set<Integer> set=new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(8);

        for(int i=0; i<10; i++){
            if (set.contains(i)){
                System.out.println("Number avilable:"+i);
            }
        }
    }
}
