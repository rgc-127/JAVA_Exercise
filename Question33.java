package Exercise;

//题目：打印出杨辉三角形（要求打印出10行如下图）      
//              1   
//            1    1   
//          1    2    1   
//        1    3    3    1   
//      1    4    6    4    1   
//  1    5    10    10    5    1   
//1    6    15    20    15    6   1
//…………


import java.util.ArrayList;

public class Question33 {
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();


        for (int i = 1; i <= 10; i++) {

            for (int j = 0; j < i; j++) {
                if (j == 0){
                for (int k = 10; k > i; k--) {
                    System.out.print("  ");
                }
                }

                if (i < 3){

                    System.out.print(1);
                    arr1.add(1);

                    System.out.print("    ");

                }else{
                    if (j == 0){

                        arr2.add(1);
                        System.out.print(1);
                        System.out.print("    ");
                    }else if (j == i-1){
                        arr2.add(1);
                        System.out.print(1);
                        System.out.print("    ");

                    }else {
                        arr2.add(arr1.get(j - 1) + arr1.get(j));
                        System.out.print(arr2.get(j));
                        System.out.print("    ");
                    }


                }


            }
            if (i >= 3){
                arr1 = arr2;
                arr2 = new ArrayList<>();
            }

            System.out.println();

        }


    }

}

