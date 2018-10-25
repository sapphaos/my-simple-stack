package deqo.agail.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MySimpleStack implements SimpleStack{
    public MySimpleStack(){
        list=new ArrayList<Item>();
    }

    private ArrayList<Item> list;

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public void push(Item item) {
        list.add(0,item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return list.get(0);
    }

    @Override
    public Item pop() throws EmptyStackException {
        return list.remove(0);
    }
}
