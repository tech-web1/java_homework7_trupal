package homework7;

import java.util.*;

public class P10_Trainline {
    public static void main(String[] args) {
        P10_Trainline p10Trainline=new P10_Trainline();
        p10Trainline.trainLines();
    }
    private void trainLines(){
        Map<String, List<String>> stationMap=new HashMap<>();

        List<String>liverpoolList=new ArrayList<>();
        liverpoolList.add("Central");
        liverpoolList.add("Circle");
        liverpoolList.add("Metropolitan & lines");
        liverpoolList.add("Hammersmith & city");
        stationMap.put("Liverpool street", liverpoolList);

        List<String>banklist=new ArrayList<>();
        banklist.add("Central");
        banklist.add("Circle");
        banklist.add("Hammersmith & city");
        stationMap.put("Bank", banklist);

        System.out.println("Enter station name: ");
        Scanner scanner=new Scanner(System.in);
        String stationName=scanner.next();

        System.out.println("Below lines are passes through"+stationName);
        List<String>lineList=stationMap.get(stationName);
        for (String line: lineList){
            System.out.println(line);
        }

    }
}
