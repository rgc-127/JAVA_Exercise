package Exercise;

//题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。        

import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个5位数");
        String n = console.nextLine();

        char[] hw = n.toCharArray();
        if ((hw[0] == hw[4]) && (hw[1] == hw[3])){
            System.out.println("是回文");
        }else System.out.println("不是回文");







    }

}

