package Exercise;

import static java.lang.StrictMath.sqrt;
//题目：判断101-200之间有多少个素数，并输出所有素数。
//程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除， 则表明此数不是素数，反之是素数。  
public class Question2 {
    public static void main(String[] args) {

        int n;


       loop1: for (  n = 101; n < 200; n++) {
            double a = sqrt(n);
            for (int i = 2; i <= a ; i++) {
                if (n % i == 0){

                    continue loop1;
                }

            }
            System.out.print(n+",");
        }



    }
}
