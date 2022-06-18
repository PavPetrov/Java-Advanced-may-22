package P06_GenericCountMethodDouble;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable> {
    private List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public List<T> getValues() {
        return values;
    }

    public void add(T element) {
        this.values.add(element);
    }

    public void swap(int index1, int index2) {
        T temp = values.get(index1);
        values.set(index1, values.get(index2));
        values.set(index2, temp);
        //    Collections.swap(values, index1, index2);
    }

    public int getCountOfGreater(T elem) {
        return (int) values.stream().filter(v -> v.compareTo(elem) > 0).count();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb.append(String.format("%s: %s%n", value.getClass().getName(), value.toString()));
        }
        return sb.toString();
    }
}