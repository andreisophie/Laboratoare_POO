package task1.observers;

import java.util.Observable;
import java.util.Observer;

import task1.observables.SensorData;
import task1.utils.Utils;

public class ServerCommunicationController implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        SensorData new_data = (SensorData) arg;
        ServerMessage new_server_message = new ServerMessage(new_data.getStepsCount(), Utils.getClientId(), new_data.getTimestamp());
        System.out.println("Generated server message: " + new_server_message.toString());
    }
}
