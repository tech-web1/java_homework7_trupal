package homework7;

public class P3_ReverseArray {
    public static void main(String[] args) {
        P3_ReverseArray p3_reverseArray=new P3_ReverseArray();
        p3_reverseArray.reverse();

    }
    private void reverse(){
        int[]array={10,20,30,40,50};
        System.out.println("Before reverse");
        for (int i=0; i < array.length;i++){
            System.out.println(array[i]);
        }
        for (int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-i -1];
            array[array.length-i -1]=temp;
        }
        System.out.println("After reverse");
        for (int i =0;i< array.length;i++){
            System.out.println(array[i]);
        }

    }
}
