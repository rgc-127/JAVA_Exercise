package Exercise;

//题目：输入某年某月某日，判断这一天是这一年的第几天？   

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = console.nextInt();
        System.out.println("请输入月份：");
        int month = console.nextInt();
        System.out.println("请输入日期：");
        int day = console.nextInt();
        int i = 1, sum = 0;

            do {
                switch (i) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (i != month){
                            sum += 31;

                        }else{
                            sum +=day;
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:

                        if (i != month){
                            sum += 30;

                        }else{
                            sum +=day;
                        }

                        break;
                    case 2:
                        if (i != month){
                            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                                sum += 29;

                            } else {
                                sum += 28;
                            }
                        }else{
                            sum +=day;

                        }

                        break;
                    default:
                        break;

                }
                i++;

            }while (i -1 != month) ;

        System.out.println("这一天是这一年的第"+sum+"天");
    }


}

