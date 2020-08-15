package Exercise;

//题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。  

public class Question20 {
    public static void main(String[] args) {


        double sum = 0;
        double m = 1, n = 2,j;
        for (int i = 0; i < 5; i++) {

            sum = sum + (n / m);
            j = m;
            m =  n;
            n = j + n ;
            System.out.println(sum);
        }

        System.out.println(sum);


    }

   
}

