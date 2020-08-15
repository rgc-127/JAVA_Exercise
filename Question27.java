package Exercise;

//题目：求100之内的素数(1是不是素数?)   
//大于1的自然数，因数只有1 和它本身
public class Question27 {
    public static void main(String[] args) {
        System.out.println("100之内的素数有：");
        System.out.println(2);
        loop1:for (int i = 3; i < 100; i++) {
            for (int j = 1; j <= i / 2; j++) {
                if (j == 1) {
                    continue;
                }
                if (i % j == 0){
                    continue loop1;
                }
            }
            System.out.println(i);
        }
    }
}

