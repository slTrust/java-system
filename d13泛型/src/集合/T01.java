package 集合;

import java.util.*;

public class T01 {
    public static void main(String[] args) {

        // 集合

        // 列表
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // 操作 在尾部添加
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("~~~~");

        // 通过索引去访问
        arrayList.get(0);

//        arrayList.subList(0,5); // 取出 索引从 0 到 5 位置的列表  内容不够就报错

        // 通过索引 删除
        arrayList.remove(0);

        // 访问 列表的长度
        int size = arrayList.size();

        // for循环里的语法糖

        for (String item: arrayList) {
            System.out.println( item );
        }


        /*----------------------------------------------------------*/

        // Set 主要用来去重复
        Set<String> set = new HashSet<>();

        set.add("a");
        set.add("b");
        set.add("c");

        set.add("a"); // 去重复

        for (String item: set) {
            System.out.println( item );
        }
    }
}
