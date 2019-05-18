package work;

import java.util.ArrayList;

class MinStack {
    private ArrayList<Integer> store;
    /** initialize your data structure here. */
    public MinStack() {
        store = new ArrayList<>();
    }

    public void push(int x) {
        store.add(x);
    }

    public void pop() {
        if(store.size()==0){
            throw new Error("数组元素为空");
        }
        store.remove(store.get(store.size()-1));
    }

    public int top() {
        if(store.size()==0){
            throw new Error("数组元素为空");
        }
        return store.get(store.size()-1);
    }

    public int getMin() {
        if(store.size()==0){
            throw new Error("数组元素为空");
        }

        int res = store.get(0);
        for (int i = 1; i < store.size(); i++) {
            if( res > store.get(i) ){
                res = store.get(i);
            }
        }
        return res;
    }
}