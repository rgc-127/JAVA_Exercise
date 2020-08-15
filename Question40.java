package Exercise;


//        题目：字符串排序。(字典顺序)   

import java.util.ArrayList;
import java.util.List;

public class Question40 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("rgewg");
        list.add("heteh");
        list.add("iyugnd");
        list.add("xzatn");
        list.add("aseqgn");
        list.add("qgrfv");

        System.out.println(list);

        list.sort(String::compareTo);

        System.out.println(list);


    }

}

