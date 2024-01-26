package app.sensors;

import app.entity.Scientist;
import app.entity.Substance;

public class HighTempSensor extends Sensor {
    private final Scientist scientist;

    public HighTempSensor(Substance substance, Scientist scientist) {
        this.substance = substance;
        this.substance.attach(this);
        this.scientist = scientist;
    }

    @Override
    public void update() {
        int temp = substance.getTemp();
        double weight = substance.getWeight();

        weight = (2 * temp) + weight;
        System.out.printf("""
                  
                  Дослідник:    %s
                  
                  Речовина:     %s
                  Температура:  %d°C\s
                  Вага:         %.2f г\s
                  Індикатор:    \u26AB
                
                """, scientist.getScientistName(), substance.getSubstName(), temp, weight);
    }
}
