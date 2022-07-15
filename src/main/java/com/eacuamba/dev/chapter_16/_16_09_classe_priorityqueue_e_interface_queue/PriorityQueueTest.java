package com.eacuamba.dev.chapter_16._16_09_classe_priorityqueue_e_interface_queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        //O PriorityQueue ordena os valores em ordem de prioridades, do mais prioritario ao menos, ele remove sempre o mais prioritario assim vai, podemos passar um comparator, ou uma classe que é comparable que o quee saber como classificar quanto a prioridade.
        PriorityQueue<Double> doublePriorityQueue = new PriorityQueue<>();
        doublePriorityQueue.offer(10D);
        doublePriorityQueue.offer(30D);
        doublePriorityQueue.offer(100D);
        doublePriorityQueue.offer(50D);

        while (doublePriorityQueue.size() > 0){
            System.out.printf("The priority queue value is: %.1f%n", doublePriorityQueue.peek());
            doublePriorityQueue.poll();
        }
    }
}
