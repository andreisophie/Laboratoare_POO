package lab5.task2;

import lab5.task1.Task;

import java.util.ArrayList;

public class Queue implements Container{
    private ArrayList<Task> queue = new ArrayList<>();

    @Override
    public Task pop() {
        if (isEmpty()) {
            return null;
        }

        Task retTask = queue.get(0);
        queue.remove(0);
        return retTask;
    }

    @Override
    public void push(Task task) {
        queue.add(size(), task);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.size() == 0;
    }

    @Override
    public void transferFrom(Container container) {
        while (!container.isEmpty()) {
            push(container.pop());
        }
    }

    @Override
    public void clear() {
        queue.clear();
    }

    @Override
    public ArrayList<Task> getTasks() {
        return queue;
    }
}
