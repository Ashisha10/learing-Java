import java.util.ArrayList;

public class MyCustomList<T>{
    ArrayList<T> a = new ArrayList<>();
    public void addElement(T element) {
        a.add(element);
    }
    public void rmElement(T element) {
        a.remove(element);
    }
    public T get(int idx) {
        return a.get(idx);
    }

    public void setA(ArrayList<T> a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return a.toString();
    }
}
