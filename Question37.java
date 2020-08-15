package Exercise;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。   
public class Question37 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int count = 1;
        int index = 0;
        while ( list.size() > 1) {

            if (index > list.size() - 1){
                index = 0;
            }


            if (count == 3 ){

                list.remove(index);
                count = 1;
            }else {
                count ++;
                index ++;
            }




        }

        System.out.println(list);
    }

}

