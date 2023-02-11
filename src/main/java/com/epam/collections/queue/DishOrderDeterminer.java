package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Deque<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        int i = 1;
        while (!queue.isEmpty()){
            if (i == everyDishNumberToEat){
                list.add(queue.pollFirst());
                i=1;
            }else {
                Integer integer = queue.pollFirst();
                queue.addLast(integer);
                i++;
            }
        }
        return list;
    }
}
