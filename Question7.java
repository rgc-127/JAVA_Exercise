package Exercise;

//题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = console.nextLine();
        char []chararr = str.toCharArray();

        int letterCount = 0 , numCount = 0, spaceCount = 0, otherCount = 0;

        for (int i = 0; i < chararr.length; i++) {

            if(Character.isLetter(chararr[i])){
                letterCount++;
            }else if (Character.isDigit(chararr[i])){
                numCount++;
            }else if (Character.isSpaceChar(chararr[i])){
                spaceCount++;
            }else {
                otherCount++;
            }
        }
        System.out.println("英文字母、数字、空格和其它字符的个数分别为"+letterCount+","+numCount+","+spaceCount+","+otherCount);

    }
}
