package Exercise;


//
//        【程序39】   
//        题目：编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n    
public class Question39 {
    public static void main(String[] args) {

        System.out.println(getOdevity(4));

    }


    public static double getOdevity(int n){

        double sum = 0;
        if (n % 2 == 0){
            for (double i = 2; i <= n; i += 2) {

                sum += 1/i;
            }

        }else {

            for (double i = 1; i <= n; i += 2) {

                sum += 1/i;

            }
        }

        return sum;
    }

}

