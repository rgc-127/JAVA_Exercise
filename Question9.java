package Exercise;

//题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程     找出1000以内的所有完数。 

public class Question9 {
    public static void main(String[] args) {


        int sum = 0;
        int j;
        for (j = 1; j < 1000; j++) {

            for (int i = 0; i <= j/2; i++) {
                if (j % (i+1) == 0){
                    sum = sum + i +1;
                }

            }
            if (sum == j){
                System.out.print(j +"   ");
            }/*else{
                System.out.println(j +" 不是完数。");
            }*/
            sum = 0;
        }


    }
}
