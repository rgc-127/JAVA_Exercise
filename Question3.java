package Exercise;
//题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
public class Question3 {
    public static void main(String[] args) {
        int g,s,b,sum;

        for (int i = 100; i < 1000; i++) {
            g = i % 10;
            s = (i/10) % 10;
            b = (i/100) % 10;
            sum = g*g*g + s*s*s + b*b*b ;
            if (sum == i){
                System.out.println(i + "是水仙花数。");
            }

        }


    }
}
