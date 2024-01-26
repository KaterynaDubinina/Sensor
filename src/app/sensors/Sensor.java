package app.sensors;

import app.entity.Substance;

public abstract class Sensor {

    protected Substance substance;
    public abstract void update();
}
