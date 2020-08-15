package Exercise;

import java.util.Scanner;
//题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？   
public class Question1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入月数：");
        int n = console.nextInt();
        int sum = 2, temp = 1,a;
        for (int i = 2; i < n -1; i++) {
            a = sum;
            sum = sum + temp;
            temp = a;
        }

        System.out.println(sum);
    }
}
