// Task 02 Grade calculator.

import java.util.*;

class Grade{
    public String grade(int avgp){
        switch(avgp / 10){
            case 10:
                return "A";
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "D";
            default:
                return "F";
        }
    }
}

public class Task_02{
    public static void main(String[] args){
        Grade g = new Grade();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of subjects:");
        int tsub = sc.nextInt();
        int tmarks = 0;

        for(int i=0;i<tsub;i++){
            System.out.println("Enter the marks obtained in subjct "+(i+1));
            int marks = sc.nextInt();
            tmarks +=marks;
        }

        int avgp = tmarks / tsub;

        String Grade = g.grade(avgp);

        System.out.println("Total marks obtained :-"+tmarks);
        System.out.println("Percentage obtained:- "+avgp+"%");
        System.out.println("Grade obtained:- "+Grade);

        sc.close();

    }
}