package com.lianxi;

//算数运算符按照操作数的个数可分为“单目运算符”+“双目运算符”
//算数单目运算符有三个分别是“++(自增)” “--(自减)” “-(求相反数)”
//算数双目运算符有五个分别是“+” “-” “*” “/” “%”

//条件运算符是一种“三目运算符”
//其使用形式为“x？y：z”
//意思是当x表达式为真时结果取y值，否则结果取z

public class Test305 {
    public static void main(String[] args){
        int a = 3, b = 4;
        int x = 5, y = 6;
        boolean z = x<y && x++ == --y;
        boolean c = a>b || a-- == --b;

        System.out.println("a,b =" + a +"," +b);
        System.out.println("x,y =" + x + "," + y);
        System.out.println("z,y =" + z + "," + c);
    }
}
