package org.example;

import java.util.*;

public class Test {

    public static void main(String[] args) {


    }
}

abstract class CollectTest <T>{

    public abstract void printConsole();
    public abstract T findEl(T el);
    public abstract void removeEl(T el);
    public abstract void addEl(T el);

}

class ListTest <T> extends CollectTest<T> {

    private final List<T> list = new ArrayList<>();

    @Override
    public void printConsole() {

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    @Override
    public T findEl(T el) {

        return list.stream()
                .filter(listEl -> listEl.equals(el))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void removeEl(T el) {

        list.removeIf(listEl -> listEl.equals(el));

    }

    @Override
    public void addEl(T el) {

        list.add(el);
    }
}

class SetTest <T> extends CollectTest<T> {

    private final Set<T> set = new HashSet<>();

    @Override
    public void printConsole() {

        for (T el: set) {
            System.out.println(el);
        }
    }

    @Override
    public T findEl(T el) {

        return set.stream()
                .filter(listEl -> listEl.equals(el))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void removeEl(T el) {

        set.removeIf(listEl -> listEl.equals(el));

    }

    @Override
    public void addEl(T el) {

        set.add(el);
    }
}

class MapTest <T> extends CollectTest<T> {

    private final Map<Integer, T> map = new HashMap<>();

    @Override
    public void printConsole() {

        int i = 0;
        do {
            System.out.println(map.get(i));
        } while (i < map.size());
    }

    @Override
    public T findEl(T el) {

        return map.entrySet().stream()
                .filter(mapEl -> mapEl.getValue().equals(el))
                .findFirst()
                .map(Map.Entry::getValue)
                .orElse(null);
    }

    @Override
    public void removeEl(T el) {

        map.entrySet().removeIf(mapEl -> mapEl.getValue().equals(el));

    }

    @Override
    public void addEl(T el) {

        map.putIfAbsent(map.size(), el);
    }
}

class QueueTest <T> extends CollectTest<T> {

    Queue<T> queue = new LinkedList<>();

    @Override
    public void printConsole() {

        String tmp = "";
        while (tmp != null){
            System.out.println(queue.poll());
        }
    }

    @Override
    public T findEl(T el) {

        int count = 0;
        for (T elQueue: queue) {
            if (!elQueue.equals(el)){
                count++;
            }
            else {
                break;
            }
        }
        if (count == 0){
            System.out.println(el + "not found");
        }
        else {
            System.out.println("position of" + count);
        }

        return el;
    }

    @Override
    public void removeEl(T el) {

        queue.remove(el);

    }

    @Override
    public void addEl(T el) {

        queue.offer(el);
    }
}