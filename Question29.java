package Exercise;

//题目：求一个3*3矩阵对角线元素之和


import java.util.Arrays;

public class Question29 {
    public static void main(String[] args) {


        int[][] a = { {1,2,3},{4,5,6},{7,8,9}};

        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[1]));
        System.out.println(Arrays.toString(a[2]));

        int sum = 0;
        for (int i = 0; i < 3; i++) {

            sum += a[i][i]+a[i][a.length - 1 - i];


        }

        sum -= a[1][1];

        System.out.println(sum);



    }

}

