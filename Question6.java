package Exercise;

//题目：输入两个正整数m和n，求其最大公约数和最小公倍数。   
/*在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数，取得的余数作为下一轮循环的较小的数，
如此循环直到较小的数的值为0，返回较大的数，此数即为最大公约数，最小公倍数为两数之积除以最大公约数。*/

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("请输入两个正整数");
        System.out.print("正整数1：");
        int m = console.nextInt();
        System.out.print("正整数2：");
        int n = console.nextInt();
        int a,b,i;
        if (m < n){

            a = n;
            b = m;
        }else{
            a = m;
            b = n;
        }

        do{
            i = b;
            b = a % b;
            a = i;

        }while (b != 0);

        System.out.println("最大公约数为："+a+",  最小公倍数为："+(m*n/a));
    }
}
