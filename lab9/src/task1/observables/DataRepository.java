package task1.observables;

import java.util.ArrayList;
import java.util.Observable;

public class DataRepository extends Observable {
    private ArrayList<SensorData> dataList = new ArrayList<>();

    public void addData(SensorData dataRecord) {
        dataList.add(dataRecord);
        setChanged();
        notifyObservers(dataRecord);
    }

    public ArrayList<SensorData> getDataList() {
        return dataList;
    }

    public void setDataList(ArrayList<SensorData> dataList) {
        this.dataList = dataList;
    }
}
