package 自己实现不同类型的栈;

import java.util.ArrayList;

// 自己实现一个泛型，支持任意类型的Stack ，
// 把数据类型变成参数，把重复代码去除了 如 IntStack / StringStack
// T 是 类型参数
public class Stack2<T> {
    ArrayList<T> store = new ArrayList<>();

    public void push(T item){
        store.add(item);
    }

    public T pop(){
        T tmp = store.get(store.size() - 1);
        store.remove(store.size() - 1);
        return tmp;
    }

    public int size(){
        return store.size();
    }
}
