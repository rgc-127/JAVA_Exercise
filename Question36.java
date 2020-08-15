package Exercise;

//题题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数   

import java.util.Scanner;

public class Question36 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < arr.length ; i++) {

                arr[i]= sc.nextInt();

            }

            for (int i = n-m; i < arr.length ; i++) {

                System.out.print(arr[i]+" ");

            }
            for (int i = 0; i < n-m; i++) {

                System.out.print(arr[i]+" ");

            }
            System.out.println();
        }


    }

}

