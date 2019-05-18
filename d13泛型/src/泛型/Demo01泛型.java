package 泛型;

import java.util.HashMap;
import java.util.Stack;

public class Demo01泛型 {
    // 泛型
    // 定义了hash表 key是 String类型 value是 Integer类型
    static HashMap<String,Integer> counts = new HashMap<>();

    static Stack<String> stringStack = new Stack<>();

    static Stack<Integer> intStack = new Stack<>();


    public static void main(String[] args) {
        stringStack.push("abc");

        String one = stringStack.pop();


        intStack.push(1);
        Integer two = intStack.pop();


        // intStack.push("ssss");  规定了Stack 内的类型是 int的 所以无法 加入 String类型的



    }
}
