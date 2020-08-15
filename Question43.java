package Exercise;


//
//        【程序43】   
//        题目：计算字符串中子串出现的次数  
//        例如：字符串abcewegwgegwefwre中we出现了2次；
//        字符串aaawersfoitngjaa中aa出现了2次 

public class Question43 {
    public static void main(String[] args) {

        String str = "aaawersfoitngjaa";

        System.out.println(getTime(str,"a"));


    }

    public static int getTime(String str1,String str2){

        int i = 0;
        int count = 0;
        if ((i = str1.indexOf(str2)) != -1){

            String sub = str1.substring(i+str2.length());
            count += getTime(sub,str2);
            count ++;
        }
        return count ;
    }
}

