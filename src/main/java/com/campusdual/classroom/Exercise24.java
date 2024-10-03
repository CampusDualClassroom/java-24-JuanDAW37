package com.campusdual.classroom;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {

    public static Queue<String> cola = new LinkedList<>();

    public static Queue<String> createQueue() {
        cola.add("Smith");
        cola.add("Montessori");
        cola.add("Peralta");
        cola.add("House");
        Iterator<String> it =cola.iterator();
        while(it.hasNext()) {
            String element = it.next();
            System.out.println(element);
        }
        return cola;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        cola = createQueue();
        printAndEmptyQueue(cola);
    }

}
