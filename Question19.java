package Exercise;

//题目：打印出如下图案（菱形）   
//   *   
//  ***   
// *****   
//*******   
// *****   
//  ***   
//   *     

public class Question19 {
    public static void main(String[] args) {

        int i = 0;
        for ( i = 1; i <= 7; i += 2) {
            for (int k = 7; k > i ; k -= 2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for ( i -= 4; i >= 1; i -= 2) {
            for (int k = 7; k > i ; k -= 2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

   
}

