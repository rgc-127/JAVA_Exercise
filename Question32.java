package Exercise;

//题目：取一个整数a从右端开始的4～7位。   



public class Question32 {
    public static void main(String[] args) {

        int a = 546242379;
        String b = a + "";
        int n = b.length() - 1;
        for (int i = 4; i < 8; i++) {

            System.out.println(b.charAt(n - i));


        }


    }

}

