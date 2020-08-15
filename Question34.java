package Exercise;

//题目：输入3个数a,b,c，按大小顺序输出。  

import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("请输入X,Y,Z,以空格隔开：");
        int x = console.nextInt();
        int y = console.nextInt();
        int z = console.nextInt();

        if (x > y && x > z){
            if(y > z){
                System.out.println(z+","+y+","+x);
            }else{
                System.out.println(y+","+z+","+x);
            }
        }else if (x > y && x < z){
            System.out.println(y+","+x+","+z);
        }else if(x < y && x < z){
            if(y > z){
                System.out.println(x+","+z+","+y);
            }else{
                System.out.println(x+","+y+","+z);
            }
        }


    }

}

