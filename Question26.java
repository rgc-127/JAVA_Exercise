package Exercise;

//题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        //Monday Tuesday Wednesday Thursday Friday Saturday Sunday
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个大写字母：");

        String str  =console.next();

        switch (str){

            case "M":
                System.out.println("你输入的是星期一。");break;

            case "T":
                System.out.println("请输入第二个字母");
                String str1 = console.next();
                switch (str1){
                    case "u":
                        System.out.println("你输入的是星期二。");break;

                    case "h":
                        System.out.println("你输入的是星期四。");break;

                    default:
                        System.out.println("输入有误！");
                }
                break;
            case "W":
                System.out.println("你输入的是星期三。");break;

            case "F":
                System.out.println("你输入的是星期五。");break;

            case "S":
                System.out.println("请输入第二个字母");
                String str2 = console.next();
                switch (str2){
                    case "a":
                        System.out.println("你输入的是星期六。");break;

                    case "u":
                        System.out.println("你输入的是星期日。");break;

                    default:
                        System.out.println("输入有误！");
                }
                break;


            default:
                System.out.println("输入有误！");
        }






    }

}

