package Exercise;

//题目：求1+2!+3!+...+20!的和     

public class Question21 {
    public static void main(String[] args) {

        int sum = 0 ;
        int n = 1;
        for (int i = 1; i <= 5 ; i++) {

            n = n * i;

            sum += n;


        }
        System.out.println(sum);







    }

   
}

