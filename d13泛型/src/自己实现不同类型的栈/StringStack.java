package 自己实现不同类型的栈;

import java.util.ArrayList;

public class StringStack {
    ArrayList<String> store = new ArrayList<>();

    public void push(String item){
        store.add(item);
    }

    public String pop(){
        String tmp = store.get(store.size() - 1);
        store.remove(store.size() - 1);
        return tmp;
    }

    public int size(){
        return store.size();
    }
}
