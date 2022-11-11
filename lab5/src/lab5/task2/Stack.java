package lab5.task2;

import lab5.task1.Task;

import java.util.ArrayList;

public class Stack implements Container{
    private ArrayList<Task> stack = new ArrayList<>();

    @Override
    public Task pop() {
        if (isEmpty()) {
            return null;
        }

        Task retTask = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return retTask;
    }

    @Override
    public void push(Task task) {
        stack.add(stack.size(), task);
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }

    @Override
    public void transferFrom(Container container) {
        while (!container.isEmpty()) {
            push(container.pop());
        }
    }

    @Override
    public void clear() {
        stack.clear();
    }

    @Override
    public ArrayList<Task> getTasks() {
        return stack;
    }
}
