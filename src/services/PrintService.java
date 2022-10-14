package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> list = new ArrayList<>();

    public PrintService() {
    }

    public List<T> getList() {
        return list;
    }

    public void addValue(T value) {
        list.add(value);
    }

    public void print() {
        System.out.print(getList());
    }
    public T first() {
            if (list.isEmpty()) {
                throw new IllegalArgumentException("List is empty!");
            } else {
                return list.get(0);
            }
        }
    }
