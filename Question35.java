package Exercise;

//题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。   


import java.util.Arrays;

public class Question35 {
    public static void main(String[] args) {

        int[] arr = {21,45,1234,11,23,523,234,6346,14,3,4,23,45,23,24};

        int max_index = 0;
        int min_index = arr.length-1;
        int max = arr[max_index];
        int min = arr[min_index];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > max){

                max = arr[i];
                max_index = i;

            }

        }

        arr[max_index] = arr[0];
        arr[0] = max;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] < min){

                min = arr[i];
                min_index = i;

            }

        }

        arr[min_index] = arr[arr.length-1];
        arr[arr.length-1] = min;

        System.out.println(Arrays.toString(arr));
    }


}

