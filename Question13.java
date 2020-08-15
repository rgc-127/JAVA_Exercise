package Exercise;

//题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？   
//PS: 完全平方数，及其平方根为整数的数

public class Question13 {
    public static void main(String[] args) {

        int i = 0;
        int  n=0 ,m;
        do{

            i++;
            n = i + 100;
            m = (int) Math.sqrt(n);
            if ( m * m == n){
                 n += 168;
                 m = (int) Math.sqrt(n);
            }

        }while(m * m != n);

        System.out.println(i);



    }
}
