package homework7;

import java.util.Scanner;

public class P2_StudentMarkSheet {
    public static void main(String[] args) {
        char morecalculation='Y';
        Scanner scanner=new Scanner(System.in);

        while(morecalculation=='Y'){
            System.out.print("\nEnter student Name \t\t:\t");
            String name= scanner.next();
            System.out.print("Enter student Roll Number \t\t:\t");
            int rollNum= scanner.nextInt();
            System.out.print("Enter Marks of Subject Maths \t:\t");
            int mathMarks= scanner.nextInt();
            if(mathMarks <0|| mathMarks>100){
                System.out.print("\nInvalid input,Marks should be between 0 to 100");
                System.out.print("\nPlease enter correct marks\t\t:\t");
                mathMarks=scanner.nextInt();
            }
            System.out.print("Enter Marks of Subject Science \t:\t");
            int scienceMark= scanner.nextInt();
            if(scienceMark <0|| scienceMark>100){
                System.out.print("\nInvalid input,Marks should be between 0 to 100");
                System.out.print("\nPlease enter correct marks\t\t:\t");
                scienceMark=scanner.nextInt();
            }System.out.print("Enter Marks of Subject English \t:\t");
            int englishMark= scanner.nextInt();
            if(englishMark <0|| englishMark>100){
                System.out.print("\nInvalid input,Marks should be between 0 to 100");
                System.out.print("\nPlease enter correct marks\t\t:\t");
                englishMark=scanner.nextInt();
            }
            int total=sum(mathMarks,scienceMark,englishMark);
            int percentage=(total*100)/300;
            String result=calculateResult(mathMarks,scienceMark,englishMark);
            String grade=calculateGrade(percentage,result);
            printTheMarkSheet(name,rollNum,mathMarks,scienceMark,englishMark,total,percentage,result,grade);
            System.out.println("Would you like to add more student result- Y or N");
            morecalculation=scanner.next().charAt(0);
        }
        scanner.close();
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static String calculateResult(int mathsMarks,int scienceMark, int englishMark){
        if (mathsMarks<35 || scienceMark <35||englishMark<35){
            return "Fail";
        }else {
            return "Pass";
        }
    }
    public static String calculateGrade(int percentage , String result){
        String grade=null;
        if (result.equalsIgnoreCase("pass")){
            if(percentage >= 80){
                grade="A+";
            } else if (percentage >=60) {
                grade="A";
            } else if (percentage >=50) {
                grade="B";
            } else if (percentage>=35) {
                grade="C";

            }
        }else {
            grade="-";
        }
        return grade;
    }
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }
}

