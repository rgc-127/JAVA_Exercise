package Exercise;

//题目：利用递归方法求5!。       

public class Question22 {
    public static void main(String[] args) {
        int n = 1,i = 5;


            n = jC(n , i);


        System.out.println(n);




    }
public static int jC(int n,int i){

        n = n * i;

    if (i != 1){

        i--;
        n = jC(n , i);
    }

    return n;
}
   
}

