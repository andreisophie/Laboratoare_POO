package lab5.task1;

import java.util.Random;

public class RandomOutTask implements Task{
    static public Random randomGen = new Random(12345);

    private int value;

    public RandomOutTask() {
        value = randomGen.nextInt();
    }

    @Override
    public void execute() {
        System.out.println(value);
    }
}
