package Exercise;

//题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。  

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入相加个数：");
        int n = console.nextInt();
        int s = 0;
        int a = 2;
        int b = 10;
        for (int i = 0; i < n; i++) {
            s = s + a  ;
            for (int j = 0; j < i; j++) {
                b = b*10;
            }
            a = a + (2 * b);
            b = 10;
        }
        System.out.println(s);
    }
}
