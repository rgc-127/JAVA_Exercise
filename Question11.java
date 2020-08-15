package Exercise;

//题目：有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？   

public class Question11 {
    public static void main(String[] args) {

        String []ch = {"1", "2", "3", "4"};
        String []ch1 = new String [1000];
        int count = 0;


        int i = 0;
        do{

            for (int j = 0; j < 4; j++) {

                if (j !=  i){

                    for (int k = 0; k < 4; k++) {
                        if(k != i && k != j){

                            ch1[count] = ch[i]+ch[j]+ch[k];
                            count ++;
                        }
                    }
                }
            }
            i++;

        }while(i < 4);

        System.out.println("能组成"+count+"个互不相同且无重复数字的三位数,分别为：");
        for (int j = 0; j < count; j++) {
            System.out.print(ch1[j]+",");
        }



    }
}
