package P07_CustomList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomList<T extends Comparable> {
    private List<T> values;

    public CustomList() {
        this.values = new ArrayList<>();
    }

    public List<T> getValues() {
        return values;
    }

    public void add(T element) {
        this.values.add(element);
    }

    public T remove(int index){
        return values.remove(index);
    }

    boolean contains(T element){
        return values.contains(element);
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

    public T getMax (){
        return values.stream().max((f,s) -> f.compareTo(s)).get();
    }

    public T getMin (){
        return values.stream().min((f,s) -> f.compareTo(s)).get();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb.append(String.format("%s%n", value.toString()));
        }
        return sb.toString();
    }

}


//•	void add(T element)
//•	T remove(int index)
//•	boolean contains(T element)
//•	void swap(int index, int index)
//•	int countGreaterThan(T element)
//•	T getMax()
//•	T getMin()