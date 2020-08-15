package Exercise;

//题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。        

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个不多于5位的正整数");
        int n = console.nextInt();
        int m = 10000, k;
        if (n >= 100000 || n < 0) {
            System.out.println("输入有误。");


        } else {
            loop1:
            for (int i = 5; i > 0; i--) {
                if (n >= m) {
                    System.out.println("这是一个" + i + "位数。");
                    System.out.print("逆序打印输出为：");
                    for (int j = 0; j < i; j++) {

                        k = n % 10;
                        System.out.print(k);
                        n /= 10;

                    }
                    break loop1;
                } else {
                    m /= 10;
                }


            }
        }


    }

}

