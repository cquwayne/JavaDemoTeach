package com.lianxi;

public class Test311 {
    public static void main(String[] args){
        short newGrade, grade;
        short s = 100;
        grade = Short.parseShort(String.valueOf(s));
        switch (grade/10){
            case 10: newGrade = 0; break;
            case 9: newGrade = 1; break;
            case 8: newGrade = 2; break;
            case 7: newGrade = 3; break;
            case 6: newGrade = 4; break;
            default: newGrade = 5;
        }
        System.out.println(grade);
        switch (newGrade){
            case 0:
            case 1:
                    System.out.println(",优秀"); break;
            case 2: System.out.println(",良好"); break;
            case 3: System.out.println(",中等"); break;
            case 4: System.out.println(",及格"); break;
            default: System.out.println(",不及格");
        }
    }

}
