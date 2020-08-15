package Exercise;

//题目：企业发放的奖金根据利润提成。
// 利润(I)低于或等于10万元时，奖金可提10%；
// 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
// 20万到40万之间时，高于20万元的部分，可提成5%；
// 40万到60万之间时高于40万元的部分，可提成3%；
// 60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润，求应发放奖金总数？   

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("请输入当月利润：");
        double i = console.nextDouble();

        if (i <= 10){

            i *= 0.1;

        }else if (i > 10 && i<20){

            i = 10*0.1 + (i-10)*0.075;

        }else if (i >= 20 && i< 40){

            i = 10*0.1 + 10*0.075 + (i - 20)* 0.05;
        }else if (i >= 40 && i< 60){

            i = 10*0.1 + 10*0.075 +  20* 0.05+ (i - 40)* 0.03;
        }else if (i >= 60 && i <= 100){

            i = 10*0.1 + 10*0.075 +  20* 0.05+ 20* 0.03+ (i - 60)* 0.015;
        }else if (i >  100){

            i = 10*0.1 + 10*0.075 +  20* 0.05+ 20* 0.03+ 40* 0.015+ (i - 100)* 0.01;
        }else {
            System.out.println("输入有误！");
        }

        System.out.println("应发放奖金总数为："+ i+"万元");


    }
}
