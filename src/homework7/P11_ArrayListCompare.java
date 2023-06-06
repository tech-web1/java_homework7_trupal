package homework7;

import java.util.ArrayList;

public class P11_ArrayListCompare {
    public static void main(String[] args) {
        P11_ArrayListCompare p11ArrayListCompare=new P11_ArrayListCompare();
        p11ArrayListCompare.arrayListcompare();
    }

    private void arrayListcompare(){
        ArrayList<String>c1=new ArrayList<>();
        c1.add("Pink");
        c1.add("Black");
        c1.add("Silver");
        c1.add("white");
        c1.add("Red");
        ArrayList<String>c2=new ArrayList<>();
        c2.add("Pink");
        c2.add("Black");
        c2.add("Silver");
        c2.add("White");
        c2.add("Red");

        c1.removeAll((c2));

        if(c1.isEmpty()){
            System.out.println("Both list are equal");
        }else {
            System.out.println("List are not equal");
        }

    }
}
