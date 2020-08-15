package Exercise;

import java.util.Scanner;
//题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。  
public class Question5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int grade = console.nextInt();

        if (grade >= 90){
            System.out.println("你的成绩是A等。");
        }else if (grade >= 60 && grade<90){
            System.out.println("你的成绩是B等。");
        }else if(grade <60 && grade > 0){
            System.out.println("你的成绩是C等。");
        }else{
            System.out.println("输入有误。");
        }

    }
}
