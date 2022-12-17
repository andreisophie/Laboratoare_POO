package task1.observers;

import java.util.Observable;
import java.util.Observer;

import task1.observables.SensorData;
import task1.strategy.StepCountStrategy;

public class DataAggregator implements Observer {
    StepCountStrategy strategy;

    public DataAggregator(StepCountStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void update(Observable o, Object arg) {
        SensorData new_data = (SensorData) arg;
        System.out.println(strategy.getStrategyDescription() + ", total step count: : " + strategy.getTotalSteps());
    }
}
