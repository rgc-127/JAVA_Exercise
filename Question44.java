package Exercise;


//
//        【程序44】
//        题目：5文钱买一只公鸡，3文钱买一只母鸡，1文钱可以买3只小鸡，现在要用100文钱买100只鸡，那么各有公鸡，母鸡，小鸡多少只？

public class Question44 {
    public static void main(String[] args) {


        double z = 1;
        double x = (8.0 / 3 * z - 200) / 2;
        double y = (400 - 14.0 / 3 * z) / 2;
        while (((x + y + z) != 100) || x < 0 || y < 0) {

            z++;
            x = (8.0 / 3 * z - 200) / 2;
            y = (400 - 14.0 / 3 * z) / 2;

        }
        System.out.println("公鸡数："+x+"  母鸡数："+y+"   小鸡数"+z);

    }


}

