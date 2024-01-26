package app.entity;

import app.sensors.Sensor;

import java.util.ArrayList;
import java.util.List;

public class Substance {

    private final List<Sensor> sensors = new ArrayList<>();
    private final String substName;
    private int temp;
    private final double weight;

    public Substance(String substName, int temp, double weight) {
        this.substName = substName;
        this.temp = temp;
        this.weight = weight;
        notifyAllSensors();
    }

    public void setTemp(int temp) {
        this.temp = temp;
        notifyAllSensors();
    }

    public String getSubstName() {
        return substName;
    }

    public int getTemp() {
        return temp;
    }

    public double getWeight() {
        return weight;
    }

    public void attach(Sensor sensor) {
        sensors.add(sensor);
    }

    public void notifyAllSensors() {
        for (Sensor sensor : sensors) {
            sensor.update();
        }
    }
}
