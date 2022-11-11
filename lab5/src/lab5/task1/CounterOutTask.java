package lab5.task1;

public class CounterOutTask implements Task{
    private static int counter = 0;

    @Override
    public void execute() {
        System.out.println(++counter);
    }
}
