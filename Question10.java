package Exercise;

//题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在     第10次落地时，共经过多少米？第10次反弹多高？

public class Question10 {
    public static void main(String[] args) {
        double a = 100;
        double sum = 0;

        for (int i = 0; i < 10; i++) {


            sum = sum+ 2 * a ;
            a = a / 2 ;//反弹



        }
        sum = sum -100;//第10次落地等于第9次反弹
        System.out.println(sum+ "   "+a);
    }
}
