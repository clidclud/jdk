package sem.generalizedProgramming3;

import java.io.DataInput;
import java.io.InputStream;

public class Task1 <T extends Comparable<T>, V extends InputStream & DataInput, K extends Number> {
    private T t;
    private V v;
    private K k;

    public Task1(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void showClass(){
        System.out.println(t.getClass().getName());
        System.out.println(v.getClass().getName());
        System.out.println(k.getClass().getName());
    }
}
