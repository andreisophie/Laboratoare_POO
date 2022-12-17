package task1.observers;

import java.util.Observable;
import java.util.Observer;

import task1.observables.SensorData;

public class ConsoleLogger implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        SensorData new_data = (SensorData) arg;
        System.out.println("New sensor data: " + new_data.toString());
    }
}
