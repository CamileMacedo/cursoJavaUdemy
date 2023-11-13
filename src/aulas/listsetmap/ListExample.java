package aulas.listsetmap;

import java.util.Arrays;

public class ListExample<T> {

    private static int INITIAL_SIZE = 8;
    private int size = 0;

    public int getSize() {
        return generico.length;
    }

    private Object[] generico;

    public ListExample() {
        generico = new Object[INITIAL_SIZE];
    }

    public void add(T element) {

        if (size == INITIAL_SIZE) {
            Object[] temp = generico;
            generico = Arrays.copyOf(temp, generico.length * 2);
        }
        generico[size] = element;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T get(int position) {

        Object obj = generico[position];

        return (T) obj;
    }

    public void print(){

        for (int i = 0; i < size; i++) {
            System.out.println(generico[i]);
        }
    }


    
}
