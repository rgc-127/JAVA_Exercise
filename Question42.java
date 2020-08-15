package Exercise;

//        【程序42】   
//        题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：
//        每位数字都加上5,然后用和除以10的余数代替该数字，
//        再将第一位和第四位交换，第二位和第三位交换。输入一个未加密数据，进行加密，并解密。
//        如：1256加密得到1076  



import java.util.Scanner;

public class Question42 {
    public static void main(String[] args) {
        Scanner console =new  Scanner(System.in);
        int n = console.nextInt();

        StringBuilder str = new StringBuilder(n + "");

        char[] cha = str.toString().toCharArray();
        int[] m = new int[4];
        str = new StringBuilder();
        for (int i = cha.length - 1; i >= 0 ; i--) {

            str.append((Integer.parseInt(cha[i] + "") + 5) % 10);
        }

        System.out.println(str);



    }

}

