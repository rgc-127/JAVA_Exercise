package Exercise;

//题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。    

import java.util.Arrays;
import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {

        int[] arr = {111, 222, 444, 12, 54, 7};
        Arrays.sort(arr);
        int[] narr = Arrays.copyOf(arr, 7);
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个数：");
        narr[6] = console.nextInt();

        int k;

        for (int i = narr.length - 1; i >0 ; i--) {

            if (narr[i] < narr[i - 1]) {

                k = narr[i];
                narr[i] = narr[i - 1];
                narr[i - 1] = k;

            } else {
                break;
            }

        }
        System.out.println(Arrays.toString(narr));

    }

}

